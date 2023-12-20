package com.example.zhaopin_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Position {
    private int id;
    private int recruiter_id;
    private String name;
    private float salary;
    private int address_id;
    private String requires;
}
