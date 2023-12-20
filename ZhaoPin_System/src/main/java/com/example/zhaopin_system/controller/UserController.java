package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.r.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController {
    @RequestMapping("/now")
    public R selectnowUser(){
        R r=new R();
        if(Userstatus.user instanceof JobSeeker){
            r.setStatus("JobSeeker");
            r.setData(Userstatus.user);
        }else if(Userstatus.user instanceof Recruiter){
            r.setStatus("Recruiter");
            r.setData(Userstatus.user);
        }else{
            r.setStatus("null");
        }
        return r;
    }
}
