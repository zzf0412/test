package com.example.zhaopin_system.controller;

import com.example.zhaopin_system.entity.Resume;
import com.example.zhaopin_system.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Resume")
@CrossOrigin
public class ResumeController {
    @Autowired
    ResumeService resumeService;
    @RequestMapping("/selectBySeekerid")
    public List<Resume> selectResumeBySeekerid(){
        return resumeService.selectResumeBySeekerid();
    }
    @RequestMapping("/selectByid")
    public Resume selectResumeByid(int id){
        return resumeService.selectResumeByid(id);
    }
    @RequestMapping("/update")
    public int updateResume(@RequestBody Resume resume){
        return resumeService.updateResume(resume);
    }
    @RequestMapping("/insert")
    public int insertResume(@RequestBody Resume resume){
        return resumeService.insertResume(resume);
    }
    @RequestMapping("/delete")
    public int deleteResume(@RequestBody Resume resume){
        return resumeService.deleteResume(resume);
    }
}
