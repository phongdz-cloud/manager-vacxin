package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationManagerDTO {
    private String vaccinationId;

    @NotBlank
    private Date startTime;

    @NotBlank
    private Date date;
    private Boolean status;
    @NotBlank
    private String description;
    private Boolean deleteFlag;
    private String vaccineId;
    private String vaccinationTypeId;
    private String locationId;
}
