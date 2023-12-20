package com.example.zhaopin_system.service.impl;

import com.example.zhaopin_system.entity.JobSeeker;
import com.example.zhaopin_system.entity.Resume;
import com.example.zhaopin_system.entity.Userstatus;
import com.example.zhaopin_system.mapper.ResumeMapper;
import com.example.zhaopin_system.r.R;
import com.example.zhaopin_system.service.RecruiterService;
import com.example.zhaopin_system.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeMapper resumeMapper;
    @Override
    public List<Resume> selectResumeBySeekerid() {
        List<Resume> resumeList=new LinkedList<>();
        if(Userstatus.user instanceof JobSeeker){
            resumeList=resumeMapper.selectResumeBySeekerid(((JobSeeker) Userstatus.user).getId());
        }
        return resumeList;
    }

    @Override
    public Resume selectResumeByid(int id) {
        return resumeMapper.selectResumeByid(id);
    }

    @Override
    public int updateResume(Resume resume) {
        return resumeMapper.updateResume(resume);
    }

    @Override
    public int insertResume(Resume resume) {
        return resumeMapper.insertResume(resume);
    }

    @Override
    public int deleteResume(Resume resume) {
        return resumeMapper.deleteResume(resume);
    }
}
