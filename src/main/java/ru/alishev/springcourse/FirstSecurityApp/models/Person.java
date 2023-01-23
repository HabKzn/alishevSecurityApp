package ru.alishev.springcourse.FirstSecurityApp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    private String username;
    @Min(value = 1900)
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    private String password;

    private String role;

    public Person() {
    }

}
