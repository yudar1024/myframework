package com.roger.mapper;

import com.roger.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roger chen on 2015/5/15.
 */
@Component
public interface RoleMapper {
    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}
