package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    List<Address> selectAllAddress();
    Address selectAddressByid(int id);
    int insertAddress(Address address);
}
