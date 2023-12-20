package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.r.R;
import com.example.zhaopin_system.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/JobSeeker")
@CrossOrigin
public class JobSeekerController {
    @Autowired
    private JobSeekerService jobSeekerService;
    @RequestMapping("/login")
    public R login(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.login(jobSeeker);
    }
    @RequestMapping("/register")
    public int register(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.register(jobSeeker);
    }
}
