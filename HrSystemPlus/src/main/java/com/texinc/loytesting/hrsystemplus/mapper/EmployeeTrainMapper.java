package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.EmployeeTrain;

/**
 * @author i@loyio.me
 * @date 2020/11/17 6:14 PM
 */
public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);
}
