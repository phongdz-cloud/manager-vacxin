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
@Document(collection = "patient")
public class Patient {
    @Id
    private String patientId;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String guardian;
    private String phone;
    private String address;
    private String email;
    private Boolean deleteFlag;
    //One to many
    private Set<VaccinationHistory> vaccinationHistoryList;
    //OneToOne
    private Account account;
}
