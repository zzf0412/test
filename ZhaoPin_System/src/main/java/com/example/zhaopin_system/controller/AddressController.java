package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.Address;
import com.example.zhaopin_system.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Address")
@CrossOrigin
public class AddressController {
    @Autowired
    AddressService addressService;
    @RequestMapping("/selectAll")
    public List<Address> selectAllAddress(){
        return addressService.selectAllAddress();
    }
    @RequestMapping("/selectByid")
    public Address selectAddressByid(int id){
        return addressService.selectAddressByid(id);
    }
    @RequestMapping("/insert")
    public int insertAddress(@RequestBody Address address){
        return addressService.insertAddress(address);
    }

}
