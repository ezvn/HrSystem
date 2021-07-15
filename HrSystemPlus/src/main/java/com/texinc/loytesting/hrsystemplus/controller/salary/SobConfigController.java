package com.texinc.loytesting.hrsystemplus.controller.salary;

import com.texinc.loytesting.hrsystemplus.bean.RespBean;
import com.texinc.loytesting.hrsystemplus.bean.RespPageBean;
import com.texinc.loytesting.hrsystemplus.bean.Salary;
import com.texinc.loytesting.hrsystemplus.service.EmpService;
import com.texinc.loytesting.hrsystemplus.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/18 9:09 PM
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SobConfigController {
    @Autowired
    EmpService employeeService;
    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        return employeeService.getEmployeeByPageWithSalary(page, size);
    }

    @GetMapping("/salaries")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid, Integer sid) {
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if (result == 1 || result == 2) {
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
