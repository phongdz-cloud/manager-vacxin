package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "vaccine")
public class Vaccine {
    @Id
    private String vaccineId;
    private String name;
    private String licenseCode;
    private String origin;
    private String age;
    private String maintenance;
    private String image;
    private Double dosage;
    private String expired;
    private Long quantity;
    private Boolean deleteFlag;
    private Integer times;
    private Integer duration;
    // One To Many Invoice
    private Set<Invoice> invoiceList;
    // Many To One Vaccine Type
    private VaccineType vaccineType;
    // One to many
    private Set<Vaccination> vaccinationList;
    // One to many
    private Set<Storage> storageList;

}
