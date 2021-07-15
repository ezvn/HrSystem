package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Salary;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:06 PM
 */
public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getAllSalaries();
}
