package com.sub.nit.restclient.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sub.nit.restclient.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final RestTemplate restTemplate;

    public EmployeeServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // POST
    @Override
    public Employee saveEmployee(Employee employee) {

        return restTemplate.postForObject(
                "http://localhost:8080/employees",
                employee,
                Employee.class
        );
    }

    // GET ALL
    @Override
    public List<Employee> getAllEmployees() {

        Employee[] employees = restTemplate.getForObject(
                "http://localhost:8080/employees",
                Employee[].class
        );

        return Arrays.asList(employees);
    }

    // GET BY ID
    @Override
    public Employee getEmployeeById(int id) {

        return restTemplate.getForObject(
                "http://localhost:8080/employees/" + id,
                Employee.class
        );
    }

    // PUT
    @Override
    public Employee updateEmployee(int id, Employee employee) {

        restTemplate.put(
                "http://localhost:8080/employees/" + id,
                employee
        );

        return restTemplate.getForObject(
                "http://localhost:8080/employees/" + id,
                Employee.class
        );
    }

    // DELETE
    @Override
    public void deleteEmployee(int id) {

        restTemplate.delete(
                "http://localhost:8080/employees/" + id
        );
    }
}
