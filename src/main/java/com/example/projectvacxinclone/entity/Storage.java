package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "storage")
public class Storage {
    @Id
    private String storageId;
    private Long quantity;
    // One to Many
    private Set<ImportAndExport> importAndExportList;
    //Many to One
    private Vaccine vaccine;

}
