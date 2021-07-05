package com.azure.javamongo.demo.services;

import com.azure.javamongo.demo.db.model.Employee;
import com.azure.javamongo.demo.db.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> listAllEmployee(){
        return employeeRepository.listAll();
    }
}
