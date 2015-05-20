package com.roger.shiro.customization.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *  将用户信息MD5加密后,再将时间戳MD5加密,然后按照特定的处理,将加密后的用户信息以及时间戳,ip地址等信息再次处理,加密后,生成cookie保存客户端...这样就避免了前面所说的安全问题...

 java.security.MessageDigest,在创建安全令牌上,比MD5更简便.因为update方法!!!
 */
/**
 * Created by chen luo jie on 2015/5/20.
 */
public class TokenProcessor {

    private static TokenProcessor instance = new TokenProcessor();

    private long previous;

    protected TokenProcessor() {
    }

    public static TokenProcessor getInstance() {
        return instance;
    }

    public synchronized String generateToken(String msg, boolean timeChange) {
        try {

            long current = System.currentTimeMillis();
            if (current == previous)                current++;
            previous = current;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(msg.getBytes());
            if (timeChange) {
                // byte now[] = (current+"").toString().getBytes();
                byte now[] = (new Long(current)).toString().getBytes();
                md.update(now);
            }
            return toHex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private String toHex(byte buffer[]) {
        StringBuffer sb = new StringBuffer(buffer.length * 2);
        for (int i = 0; i < buffer.length; i++) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }

        return sb.toString();
    }
}