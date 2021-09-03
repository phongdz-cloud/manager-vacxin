package com.example.projectvacxinclone.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "employee")
public class Employee {
    @Id
    private String employeeId;
    private String name;
    private Date dateOfBirth;
    private String idCard;
    private String address;
    private String phone;
    private Boolean deleteFlag;
    // Many to One
    private Position position;
    //One to one
    private Account account;

}
