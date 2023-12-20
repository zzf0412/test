package com.example.zhaopin_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Recruiter {
    private int id;
    private String username;
    private String password;
    private String company_name;
    private String contact_way;
    private String company_scale;
    private String company_business;
}
