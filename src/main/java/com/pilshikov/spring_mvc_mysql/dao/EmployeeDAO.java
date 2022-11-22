package com.pilshikov.spring_mvc_mysql.dao;

import com.pilshikov.spring_mvc_mysql.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);

}
