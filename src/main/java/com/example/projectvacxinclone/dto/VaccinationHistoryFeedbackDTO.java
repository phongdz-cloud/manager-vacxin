package com.example.projectvacxinclone.dto;

import java.util.Date;

public interface VaccinationHistoryFeedbackDTO {
    String getPatientId();
    String getPatientName();
    String getPatientGender();
    String getPatientAge();
    String getPatientGuardian();
    String getPatientAddress();
    String getPatientPhone();
    String getVaccineTypeName();
    Date getVaccinationDate();
    String getVaccineHistoryAfterStatus();
}
