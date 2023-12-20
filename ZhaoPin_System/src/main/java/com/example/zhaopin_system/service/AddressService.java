package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> selectAllAddress();
    Address selectAddressByid(int id);
    int insertAddress(Address address);
}
