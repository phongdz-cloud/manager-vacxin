package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodicalVaccinationTempRegisterDTO {
    private String vaccinationId;
    private String patientId;
    private Date time;
    private Date startTime;
    private Date endTime;
    private Boolean timeIsValid;
    private Boolean alreadyRegister;
}
