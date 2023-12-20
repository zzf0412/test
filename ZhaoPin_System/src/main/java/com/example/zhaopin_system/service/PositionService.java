package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> selectAllPosition();
    List<Position> selectPositionByReid();
    Position selectPositionByid(int id);
    int deletePosition(Position position);
    int updatePosition(Position position);
    int insertPosition(Position position);
}
