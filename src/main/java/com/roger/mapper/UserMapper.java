package com.roger.mapper;

import com.roger.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roger chen on 2015/5/15.
 */
@Component
public interface UserMapper {
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);
}
