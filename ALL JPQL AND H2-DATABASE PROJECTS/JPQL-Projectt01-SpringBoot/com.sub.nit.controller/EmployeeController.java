package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Employee;
import com.sub.nit.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Save Employee
    @PostMapping("/save")
    public Employee save(@RequestBody Employee emp) {
        return service.saveEmployee(emp);
    }

    // Get Employees by Department (JPQL)
    @GetMapping("/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department) {
        return service.getEmployeeByDepartment(department);
    }

    // Get Employees by Salary (Native SQL)
    @GetMapping("/salary/{salary}")
    public List<Employee> getEmployeeBySalary(@PathVariable double salary) {
        return service.getEmployeeBySalary(salary);
    }
}
