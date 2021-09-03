package com.example.projectvacxinclone.dto;


import java.util.Date;

public interface PeriodicVaccinationDto {
    String getPatientId();
    String getName();
    Date getDateOfBirth();
    String getGender();
    String getGuardian();
    String getPhone();
    String getAddress();
    String getStatus();
}
