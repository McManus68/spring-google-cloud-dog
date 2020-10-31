package com.mcmanus.dog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
public class Dog {
    @Id
    private Long id;
    private String name;
    private int age;
}