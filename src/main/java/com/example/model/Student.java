package com.example.model;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Serdeable.Deserializable
@Serdeable.Serializable
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roll;

    private String firstName;

    private String lastName;

    private Integer standard;
}
