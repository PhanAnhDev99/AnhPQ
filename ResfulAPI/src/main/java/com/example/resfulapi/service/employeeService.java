package com.example.resfulapi.service;

import com.example.resfulapi.entity.employee;
import com.example.resfulapi.repository.employeeRepository;
import com.example.resfulapi.response.employeeReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeService {
    // co thẻ tách ra interface
    @Autowired
    private employeeRepository emRepo;
    public employee addEmployee(employee em){
        return emRepo.save(em);
    }
    public List<employee> addList(List<employee> list){
        return emRepo.saveAll(list);
    }

}
