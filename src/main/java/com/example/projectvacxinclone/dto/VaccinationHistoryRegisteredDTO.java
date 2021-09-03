package com.example.projectvacxinclone.dto;

import java.util.Date;

public interface VaccinationHistoryRegisteredDTO {
    String getVaccinationHistoryId();
    String getPatientId();
    String getPatientName();
    String getPatientDob();
    String getPatientGender();
    String getPatientGuardian();
    String getPatientPhone();
    String getPatientAddress();
    String getVaccineName();
    String getVaccineTypeName();
    Boolean getVaccinationHistoryStatus();
    Date getEntTime();
    String getDosage();
    String getPreStatus();
    String getAfterStatus();
    Integer getVaccinationTimes();
}
