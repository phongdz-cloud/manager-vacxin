package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationDTO {
    private String vaccinationId;
    private Date startTime;
    private Date endTime;
    private Date date;
    private Boolean status;
    private String description;
    private Boolean deleteFlag;
    private String vaccineId;
    private String vaccinationTypeId;
    private String locationId;
}
