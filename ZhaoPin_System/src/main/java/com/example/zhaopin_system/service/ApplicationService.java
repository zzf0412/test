package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> selectApplicationByPoid(int id);
    List<Application> selectApplicationByJSid();
    List<Application> selectApplicationByReid();
    int createApplication(Application application);
    int updateApplication(Application application);

}
