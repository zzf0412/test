package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.r.R;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JobSeekerService {
    R login(JobSeeker jobSeeker);
    int register(JobSeeker jobSeeker);
}
