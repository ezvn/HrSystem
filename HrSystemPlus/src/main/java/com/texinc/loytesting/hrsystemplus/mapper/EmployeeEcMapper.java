package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.EmployeeEc;

/**
 * @author i@loyio.me
 * @date 2020/11/17 6:04 PM
 */
public interface EmployeeEcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeEc record);

    int insertSelective(EmployeeEc record);

    EmployeeEc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeEc record);

    int updateByPrimaryKey(EmployeeEc record);
}
