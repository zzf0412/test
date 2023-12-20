package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.Application;
import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.mapper.ApplicationMapper;
import com.example.zhaopin_system.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationMapper applicationMapper;
    @Override
    public List<Application> selectApplicationByPoid(int id) {
        List<Application> applicationList=new LinkedList<>();
        applicationList.addAll(applicationMapper.selectApplicationByPoid(id));
        return applicationList;
    }
    /*
    * 如果登录的是求职者可用
    * */
    @Override
    public List<Application> selectApplicationByJSid() {
        List<Application> applicationList=new LinkedList<>();
        if(Userstatus.user instanceof JobSeeker) {
            applicationList.addAll(applicationMapper.selectApplicationByJSid(((JobSeeker) Userstatus.user).getId()));
        }
        return applicationList;
    }

    @Override
    public List<Application> selectApplicationByReid() {
        List<Application> applicationList=new LinkedList<>();
        if(Userstatus.user instanceof Recruiter) {
            applicationList.addAll(applicationMapper.selectApplicationByReid(((Recruiter) Userstatus.user).getId()));
        }
        return applicationList;
    }

    @Override
    public int createApplication(Application application) {
        application.setAdd_time(new Date());
        application.setStatus("申请中");
        return applicationMapper.createApplication(application);
    }

    @Override
    public int updateApplication(Application application) {
        return applicationMapper.updateApplication(application);
    }
}
