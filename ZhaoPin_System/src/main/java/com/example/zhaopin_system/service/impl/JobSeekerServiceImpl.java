package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.mapper.JobSeekerMapper;
import com.example.zhaopin_system.r.R;
import com.example.zhaopin_system.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class JobSeekerServiceImpl implements JobSeekerService {
    @Autowired
    private JobSeekerMapper jobSeekerMapper;

    @Override
    public R login(JobSeeker jobSeeker) {
        JobSeeker jobSeeker1=jobSeekerMapper.selectJobSeeker(jobSeeker);
        R r=new R();
        if(jobSeeker1!=null){
            r.setStatus("success");
            r.setData(jobSeeker1);
            Userstatus.user=jobSeeker1;
        }else{
            r.setStatus("Error");
        }
        return r;
    }

    @Override
    public int register(JobSeeker jobSeeker) {
        JobSeeker jobSeeker1=jobSeekerMapper.selectJobSeeker(jobSeeker);
        int result=0;
        if(jobSeeker1==null) {
            result = jobSeekerMapper.insertJobSeeker(jobSeeker);
        }else{
            result=0;
        }
        return result;
    }
}
