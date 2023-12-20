package com.example.zhaopin_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Application {
    private int id;
    private int jobseeker_id;
    private int recruiter_id;
    private int position_id;
    private int resume_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date add_time;
    private String status;
}
