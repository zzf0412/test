package com.example.zhaopin_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resume {
    private int id;
    private int jobseeker_id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String contact_way;
    private String edu_background;
    private String identity;
    private String school;
    private String major;
    private String skills;
    private String project_exp;
    private String awards;
    private String interest;
    private String address;
    private String email_address;
}
