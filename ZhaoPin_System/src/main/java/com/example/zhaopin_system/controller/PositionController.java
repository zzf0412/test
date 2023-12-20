package com.example.zhaopin_system.controller;


import com.example.zhaopin_system.entity.Position;
import com.example.zhaopin_system.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/Position")
@CrossOrigin
public class PositionController {
    @Autowired
    PositionService positionService;
    @RequestMapping("/selectAll")
    public List<Position> selectAllPosition(){
        return positionService.selectAllPosition();
    }

    @RequestMapping("/selectByReid")
    public List<Position> selectPositionByReid(){
        return positionService.selectPositionByReid();
    }

    @RequestMapping("/selectByid")
    public Position selectPositionByid(int id){
        return positionService.selectPositionByid(id);
    }

    @RequestMapping("/delete")
    public int deletePosition(@RequestBody Position position){
        return positionService.deletePosition(position);
    }

    @RequestMapping("/update")
    public int updatePosition(@RequestBody Position position){
        return positionService.updatePosition(position);
    }

    @RequestMapping("/insert")
    public int insertPosition(@RequestBody Position position){
        return positionService.insertPosition(position);
    }



}
