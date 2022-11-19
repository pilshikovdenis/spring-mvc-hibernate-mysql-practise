package com.pilshikov.spring_mvc_mysql.service;

import com.pilshikov.spring_mvc_mysql.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
}
