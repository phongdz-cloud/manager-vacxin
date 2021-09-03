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
@Document(collection = "vaccination_type")
public class VaccinationType {
    @Id
    private String vaccinationTypeId;
    private String name;
    // One To Many
    private Set<Vaccination> vaccinationList;
}
