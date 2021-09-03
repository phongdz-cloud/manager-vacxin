package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "vaccination_transaction")
public class VaccinationTransaction {
    @Id
    private String vaccinationTransactionId;
    // One to One
    private VaccinationHistory vaccinationHistory;
    private Double price;
    private Long quantity;
}
