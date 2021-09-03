package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationByRequestDTO {
    private String patientId;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String guardian;
    private String phone;
    private String email;
    private Boolean deleteFlag;
    private Date dateVaccination;
    private Date timeVaccination;
    private String vaccineId;
}
