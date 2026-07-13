package com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.entity.Employee;
import com.nit.Project_02_SpringbootRestApi_EmployeeManagementSystem.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	EmployeeService service;
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	@GetMapping("/employee")
	public Employee getEmployeeById(int id) {
		return service.getEmployeeById(id);
	}
}
