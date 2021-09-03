package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "vaccination")
public class Vaccination {
    @Id
    private String vaccinationId;
    private Date startTime;
    private Date endTime;
    private String date;
    private Boolean status;
    private String description;
    private Boolean deleteFlag;
    //Many to One Vaccine

    //One To Many
    private Set<VaccinationHistory> vaccinationHistoryList;

    //Many To One vaccinationType;

    //Many To One Location
}
