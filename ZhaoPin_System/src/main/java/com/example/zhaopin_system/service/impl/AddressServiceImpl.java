package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.Address;
import com.example.zhaopin_system.mapper.AddressMapper;
import com.example.zhaopin_system.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressMapper addressMapper;
    @Override
    public List<Address> selectAllAddress() {
        return addressMapper.selectAllAddress();
    }

    @Override
    public Address selectAddressByid(int id) {
        return addressMapper.selectAddressByid(id);
    }

    @Override
    public int insertAddress(Address address) {
        return addressMapper.insertAddress(address);
    }
}
