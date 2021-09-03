package com.example.projectvacxinclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEditDTO {
    private String employeeId;
    private String name;
    private Date dateOfBirth;
    private String idCard;
    private String address;
    private String phone;
    private String position;
    private String account;
    private String role;
}
