package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodicalSearchDataDTO {
    private String vaccineName;
    private Date startTime;
    private Date endTime;
    private Date date;
    private String age;
    private String description;
}
