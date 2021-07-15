package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Employee;
import com.texinc.loytesting.hrsystemplus.bean.RespPageBean;
import com.texinc.loytesting.hrsystemplus.mapper.EmpMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 4:05 PM
 */
@Service
public class EmpService {
    @Autowired
    EmpMapper empMapper;

    @Autowired
    public final static Logger logger = LoggerFactory.getLogger(EmpService.class);
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> data = empMapper.getEmployeeByPage(page, size, employee, beginDateScope);
        Long total = empMapper.getTotal(employee, beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public Integer addEmp(Employee employee) {
        Date beginContract = employee.getBeginContract();
        Date endContract = employee.getEndContract();
        double month = (Double.parseDouble(yearFormat.format(endContract)) - Double.parseDouble(yearFormat.format(beginContract))) * 12 + (Double.parseDouble(monthFormat.format(endContract)) - Double.parseDouble(monthFormat.format(beginContract)));
        employee.setContractTerm(Double.parseDouble(decimalFormat.format(month / 12)));
        int result = empMapper.insertSelective(employee);
        return result;
    }

    public Integer maxWorkID() {
        return empMapper.maxWorkID();
    }

    public Integer deleteEmpByEid(Integer id) {
        return empMapper.deleteByPrimaryKey(id);
    }

    public Integer updateEmp(Employee employee) {
        return empMapper.updateByPrimaryKeySelective(employee);
    }

    public Integer addEmps(List<Employee> list) {
        return empMapper.addEmps(list);
    }

    public RespPageBean getEmployeeByPageWithSalary(Integer page, Integer size) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> list = empMapper.getEmployeeByPageWithSalary(page, size);
        RespPageBean respPageBean = new RespPageBean();
        respPageBean.setData(list);
        respPageBean.setTotal(empMapper.getTotal(null, null));
        return respPageBean;
    }

    public Integer updateEmployeeSalaryById(Integer eid, Integer sid) {
        return empMapper.updateEmployeeSalaryById(eid, sid);
    }

    public Employee getEmployeeById(Integer empId) {
        return empMapper.getEmployeeById(empId);
    }
}
