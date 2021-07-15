package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 4:12 PM
 */
public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") Employee employee,@Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("emp") Employee employee,@Param("beginDateScope") Date[] beginDateScope);

    Integer maxWorkID();

    Integer addEmps(@Param("list") List<Employee> list);

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByPageWithSalary(@Param("page") Integer page, @Param("size") Integer size);

    Integer updateEmployeeSalaryById(@Param("eid") Integer eid, @Param("sid") Integer sid);
}
