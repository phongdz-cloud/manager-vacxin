package com.example.projectvacxinclone.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@Document(collection = "vaccination_history")
public class VaccinationHistory {
    @Id
    private String vaccinationHistoryId;
    private Boolean status;
    private Double dosage;
    private String preStatus;
    private String afterStatus;
    private Integer vaccinationTimes;
    private Boolean deleteFlag = false;
    private Date startTime;
    private Date endTime;
    //Many To One

    // Many To One
    private Patient patient;

}
