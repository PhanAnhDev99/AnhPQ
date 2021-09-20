package com.example.resfulapi.service;

import com.example.resfulapi.entity.employee;
import com.example.resfulapi.repository.employeeRepository;
import com.example.resfulapi.response.employeeReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class employeeIML implements Iemployee{
    @Autowired
    private employeeRepository emRepo;
    @Override
    public employee add(employee em) {
        if(em!=null){
            return emRepo.save(em);
        }
        return null;
    }

    @Override
    public List<employee> addList(List<employee> list) {
        if(list!=null){
            return emRepo.saveAll(list);
        }
        return null;
    }

    @Override
    public Optional<employee> getOne(int id) {
            return emRepo.findById(id);
    }

    @Override
    public List<employee> getAll() {
        return emRepo.findAll();
    }

    @Override
    public employee update( employee em) {
     employee e = emRepo.getById(em.getId());
     if(e!=null){
         e.setName(em.getName());
         e.setAddress(em.getAddress());
     }
        return e;
    }

    @Override
    public List<employeeReponse> convertData(List<employee> list) {
        List<employeeReponse> listResponse = new ArrayList<employeeReponse>();
        for (employee employee1: list){
            employeeReponse eReponse = new employeeReponse();
            eReponse.setName(employee1.getName());
            listResponse.add(eReponse);
        }
        return listResponse;
    }

    @Override
    public List<employee> getAllByAddress(String address) {
        List<employee> list = emRepo.findAll();
        List<employee> listAddress = new ArrayList<employee>();
        for(employee em:list){
            if(em.getAddress().contains(address)){
                listAddress.add(em);
            }
        }
        return listAddress;
    }
}
