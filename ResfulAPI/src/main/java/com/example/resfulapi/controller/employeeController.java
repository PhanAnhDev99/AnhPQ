package com.example.resfulapi.controller;

import com.example.resfulapi.entity.employee;
import com.example.resfulapi.service.Iemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class employeeController {
    @Autowired
    private Iemployee iemployee;
    @GetMapping(value = "/show")
    public String show(){
        return "thử F5 nha";
    }
    @PostMapping(value = "/add")
    public employee add(@RequestBody employee em){
        return iemployee.add(em);
    }
    @PostMapping(value = "/addlist")
    public List<employee> add(@RequestBody List<employee> list){
        return iemployee.addList(list);
    }
    // cách truyền tham số bằng ...id?=
    @GetMapping(value = "/employeeById")
    public Optional<employee> getOne(@RequestParam("id") int id){
        return iemployee.getOne(id);
    }
    // cách truyền tham số thẳn trên url ...../2
    @GetMapping(value = "/employeeById1/{id}")
    public Optional<employee> getOne1(@PathVariable("id") int id){
        return iemployee.getOne(id);
    }
    @GetMapping(value = "/employees")
    public List<employee> getAll(){
        return iemployee.getAll();
    }
    @PutMapping(value = "/update")
    public employee update( @RequestBody employee em){
        return iemployee.update(em);
    }
    @GetMapping(value = "/searchByAddress")
    public List<employee> searchByAddress(@RequestParam("address") String address){
        return iemployee.getAllByAddress(address);
    }
    @GetMapping(value = "/getWithModel")
    public String getWithModel(@RequestParam("id") int id, Model model){
        Optional<employee> em = iemployee.getOne(id);
        model.addAttribute("employee",em);
        return "index";
    }


}
