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
@Document(collection = "account")
public class Account {
    @Id
    private String accountId;
    private String userName;
    private String encryptPw;
    private Boolean isEnabled;
    private String verificationCode;
    private String email;
    //One to One
    private Patient patient;
    //One to one
    private Employee employee;
    //One to many
    private Set<AccountRole> accountRoleList;
    //One to Many Import And Export
    private Set<ImportAndExport> importAndExportList;
}
