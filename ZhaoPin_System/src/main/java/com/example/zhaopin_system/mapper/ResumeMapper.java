package com.example.zhaopin_system.mapper;

import com.example.zhaopin_system.entity.Resume;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {
    List<Resume> selectResumeBySeekerid(int Seekerid);
    Resume selectResumeByid(int id);
    int updateResume(Resume resume);
    int insertResume(Resume resume);
    int deleteResume(Resume resume);
}
