package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Role;
import com.texinc.loytesting.hrsystemplus.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:38 PM
 */
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public Integer addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.insert(role);
    }

    public Integer deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
