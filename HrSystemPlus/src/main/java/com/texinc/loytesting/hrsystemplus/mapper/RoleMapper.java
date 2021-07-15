package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Role;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:06 PM
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getAllRoles();
}
