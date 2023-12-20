package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Position;
import com.example.zhaopin_system.entity.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> selectAllPosition();
    List<Position> selectPositionByReid(int id);
    Position selectPositionByid(int id);
    int deletePosition(Position position);
    int updatePosition(Position position);
    int insertPosition(Position position);
}
