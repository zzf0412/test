package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.r.R;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecruiterMapper {
    Recruiter selectRecruiterByid(int id);
    int insertRecruiter(Recruiter recruiter);
    Recruiter selectRecruiter(Recruiter recruiter);
}
