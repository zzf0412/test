package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Accessory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessoryMapper {
    List<Accessory> selectAllAccessory();
    List<Accessory> selectAccessoryByReid(int id);
}
