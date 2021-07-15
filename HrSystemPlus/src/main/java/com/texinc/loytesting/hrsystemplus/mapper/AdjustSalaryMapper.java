package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.AdjustSalary;

/**
 * @author i@loyio.me
 * @date 2020/11/17 5:55 PM
 */
public interface AdjustSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    AdjustSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdjustSalary record);

    int updateByPrimaryKey(AdjustSalary record);
}
