package com.example.projectvacxinclone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "import_and_export")
public class ImportAndExport {
    @Id
    private String importAndExportId;
    private String action;
    private Long quantity;
    private Date date;
    private Long price;
    private Boolean deleteFlag;
    //Many to one storage

    //Many To One account
    private Account account;
}
