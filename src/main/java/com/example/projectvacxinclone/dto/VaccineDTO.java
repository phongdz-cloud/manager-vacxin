package com.example.projectvacxinclone.dto;

import java.util.Date;

public interface VaccineDTO {
    String getId();
    String getName();
    String getVaccineType();
    Date getDayReceive();
    String getLicenseCode();
    String getOrigin();
    Double getDosage();
    Integer getShipmentNumber();
    Date getExpired();
    String getMaintenance();
    String getAge();
    Integer getQuantity();
    Integer getTimes();
    Integer getDuration();
}
