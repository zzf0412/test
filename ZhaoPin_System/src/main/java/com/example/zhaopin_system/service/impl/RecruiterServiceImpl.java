package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.Recruiter;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.mapper.RecruiterMapper;
import com.example.zhaopin_system.r.R;
import com.example.zhaopin_system.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class RecruiterServiceImpl implements RecruiterService {

    @Autowired
    RecruiterMapper recruiterMapper;
    @Override
    public R login(Recruiter recruiter) {
        Recruiter recruiter1=recruiterMapper.selectRecruiter(recruiter);
        R r=new R();
        if(recruiter1!=null){
            r.setStatus("success");
            r.setData(recruiter1);
            Userstatus.user=recruiter1;
        }else{
            r.setStatus("Error");
        }
        return r;
    }

    @Override
    public int register(Recruiter recruiter) {
        Recruiter recruiter1=recruiterMapper.selectRecruiter(recruiter);
        if(recruiter1==null){
            return recruiterMapper.insertRecruiter(recruiter);
        }else{
            return 0;
        }

    }
}
