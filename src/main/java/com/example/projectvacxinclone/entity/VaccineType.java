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
@Document(collection = "vaccine_type")
public class VaccineType {
    @Id
    private String vaccineTypeId;
    private String name;
    // one to many
    private Set<Vaccine> vaccineList;
}
