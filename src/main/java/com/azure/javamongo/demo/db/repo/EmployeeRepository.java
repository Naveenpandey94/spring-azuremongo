package com.azure.javamongo.demo.db.repo;

import com.azure.javamongo.demo.db.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public String save(Employee employee){
        mongoTemplate.save(employee);
        return employee.getId();
    }

    public List<Employee> listAll(){
        return mongoTemplate.findAll(Employee.class);
    }
}
