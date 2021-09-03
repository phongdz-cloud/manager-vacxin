package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImportAndExportDTO {
    private String importAndExportId;
    private String action;
    private Long quantity;
    private Date date;
    private Long price;
    private Boolean deleteFlag;
}
