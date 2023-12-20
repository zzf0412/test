package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.Position;
import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.mapper.PositionMapper;
import com.example.zhaopin_system.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionMapper positionMapper;
    @Override
    public List<Position> selectAllPosition() {
        return positionMapper.selectAllPosition();
    }

    @Override
    public List<Position> selectPositionByReid() {
        List<Position> positionList=new LinkedList<>();
        if(Userstatus.user instanceof Recruiter){
            positionList=positionMapper.selectPositionByReid(((Recruiter) Userstatus.user).getId());
        }
        return positionList;
    }

    @Override
    public Position selectPositionByid(int id) {
        return positionMapper.selectPositionByid(id);
    }

    @Override
    public int deletePosition(Position position) {
        return positionMapper.deletePosition(position);
    }

    @Override
    public int updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }

    @Override
    public int insertPosition(Position position) {
        return positionMapper.insertPosition(position);
    }
}
