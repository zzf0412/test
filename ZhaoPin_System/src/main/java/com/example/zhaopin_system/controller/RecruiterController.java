package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.r.R;
import com.example.zhaopin_system.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Recruiter")
@CrossOrigin
public class RecruiterController {
    @Autowired
    RecruiterService recruiterService;
    @RequestMapping("/login")
    public R login(@RequestBody Recruiter recruiter){
        return recruiterService.login(recruiter);
    }
    @RequestMapping("/register")
    public int register(@RequestBody Recruiter recruiter){
        return recruiterService.register(recruiter);
    }
}
