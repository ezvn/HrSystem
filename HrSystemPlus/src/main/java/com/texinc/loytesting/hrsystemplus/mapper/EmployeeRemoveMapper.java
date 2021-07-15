package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.EmployeeRemove;

/**
 * @author i@loyio.me
 * @date 2020/11/17 6:11 PM
 */
public interface EmployeeRemoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRemove record);

    int insertSelective(EmployeeRemove record);

    EmployeeRemove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeRemove record);

    int updateByPrimaryKey(EmployeeRemove record);
}
