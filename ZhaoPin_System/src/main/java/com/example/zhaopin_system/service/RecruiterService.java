package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.r.R;

public interface RecruiterService {
    R login(Recruiter recruiter);
    int register(Recruiter recruiter);
}
