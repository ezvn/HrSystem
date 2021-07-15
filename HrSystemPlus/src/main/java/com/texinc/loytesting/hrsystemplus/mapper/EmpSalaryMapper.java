package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.EmpSalary;

/**
 * @author i@loyio.me
 * @date 2020/11/18 7:58 AM
 */
public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    EmpSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);
}
