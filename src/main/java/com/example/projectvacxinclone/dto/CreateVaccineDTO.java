package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateVaccineDTO {
    private String imgVaccine;
    private String nameVaccine;
    private String typeVaccine;
    private String dayReceive;
    private String licenseCode;
    private String origin;
    private String provider;
    private Integer unitPrice;
    private Double dosage;
    private Long quantity;
    private String expired;
    private String maintenance;
    private String age;
    private Integer times;
    private Integer duration;
}
