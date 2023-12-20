package com.example.zhaopin_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Accessory {
    private int id;
    private int resume_id;
    private String accessory_path;
}
