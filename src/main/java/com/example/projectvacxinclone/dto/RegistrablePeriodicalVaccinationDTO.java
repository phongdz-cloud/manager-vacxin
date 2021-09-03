package com.example.projectvacxinclone.dto;

import java.util.Date;

public interface RegistrablePeriodicalVaccinationDTO {
    String getVaccinationId();
    Date getDate();
    String getStartTime();
    String getEndTime();
    String getVaccineName();
    String getAge();
    String getDescription();
    String getLocation();
    String getCountry();
    String getImage();
    Integer getDuration();
    Integer getTimes();
}
