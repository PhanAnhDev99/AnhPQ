package com.example.resfulapi.repository;

import com.example.resfulapi.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface employeeRepository extends JpaRepository<employee,Integer> {
    public List<employee> findAllByAddress(String address);
}
