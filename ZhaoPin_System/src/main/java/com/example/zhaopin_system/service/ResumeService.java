package com.example.zhaopin_system.service;

import com.example.zhaopin_system.entity.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> selectResumeBySeekerid();
    Resume selectResumeByid(int id);
    int updateResume(Resume resume);
    int insertResume(Resume resume);
    int deleteResume(Resume resume);
}
