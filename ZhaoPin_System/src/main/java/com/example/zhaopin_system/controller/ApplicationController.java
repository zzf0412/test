package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.Application;
import com.example.zhaopin_system.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Application")
@CrossOrigin
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @RequestMapping("/selectByPoid")
    public List<Application> selectApplicationByPoid(int id) {
        return applicationService.selectApplicationByPoid(id);
    }
    @RequestMapping("/selectByJSid")
    public List<Application> selectApplicationByJSid(){
        return applicationService.selectApplicationByJSid();
    }
    @RequestMapping("/selectByReid")
    public List<Application> selectApplicationByReid(){
        return applicationService.selectApplicationByReid();
    }
    @RequestMapping("/create")
    public int createApplication(@RequestBody Application application){
        return applicationService.createApplication(application);
    }
    @RequestMapping("/update")
    public int updateApplication(@RequestBody Application application){
        return applicationService.updateApplication(application);
    }

}
