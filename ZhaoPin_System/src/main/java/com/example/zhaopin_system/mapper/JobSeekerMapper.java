package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.JobSeeker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobSeekerMapper {
    List<JobSeeker> selectAllJobSeeker();
    JobSeeker selectJobSeekerByid(int id);
    JobSeeker selectJobSeeker(JobSeeker jobSeeker);
    int insertJobSeeker(JobSeeker jobSeeker);
}
