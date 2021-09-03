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
@Document(collection = "position")
public class Position {
    @Id
    private String positionId;
    private String name;
    // One to many
    private Set<Employee> employeeList;
}
