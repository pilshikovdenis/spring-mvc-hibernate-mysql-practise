package com.pilshikov.spring_mvc_mysql.controller;

import com.pilshikov.spring_mvc_mysql.dao.EmployeeDAO;
import com.pilshikov.spring_mvc_mysql.entity.Employee;
import com.pilshikov.spring_mvc_mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);

        return "all-employees";
    }
}
