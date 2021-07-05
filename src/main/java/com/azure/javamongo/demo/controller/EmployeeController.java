package com.azure.javamongo.demo.controller;

import com.azure.javamongo.demo.db.model.Employee;
import com.azure.javamongo.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("save/employee")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("all/employees")
    public List<Employee> listEmployee(){
        return employeeService.listAllEmployee();
    }

    @GetMapping("message")
    public String showMessage(){
        return "Application is deployed to azure server successfully!!";
    }
}
