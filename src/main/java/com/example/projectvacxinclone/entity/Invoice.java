package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "invoice")
public class Invoice {
    @Id
    private String invoiceId;
    private String transactionDate;
    private Long price;
    private String expired;
    private Boolean deleteFlag;
    private Long quantity;
    //Many to one Provider
    private Provider provider;
    //Many To one
    private Vaccine vaccine;
}
