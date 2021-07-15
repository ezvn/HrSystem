package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Department;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 5:04 PM
 */
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentsByParentId(Integer pid);

    void addDep(Department dep);

    void deleteDepById(Department dep);

    List<Department> getAllDepartmentsWithOutChildren();
}
