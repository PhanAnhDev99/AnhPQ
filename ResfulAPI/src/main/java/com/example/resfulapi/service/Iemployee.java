package com.example.resfulapi.service;

import com.example.resfulapi.entity.employee;
import com.example.resfulapi.response.employeeReponse;

import java.util.List;
import java.util.Optional;

public interface Iemployee {
    public employee add(employee em);

    public List<employee> addList(List<employee> list);
    public Optional<employee> getOne (int id);
    public  List<employee> getAll();
    public employee update(employee em);
    public List<employeeReponse> convertData(List<employee> list);
    public List<employee> getAllByAddress(String address);
}
