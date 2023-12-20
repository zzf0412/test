package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Application;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplicationMapper {
    List<Application> selectAllApplication();
    Application selectApplicationByid(int id);
    List<Application> selectApplicationByPoid(int id);
    List<Application> selectApplicationByReid(int id);
    List<Application> selectApplicationByJSid(int id);
    int updateApplication(Application application);
    int createApplication(Application application);
}
