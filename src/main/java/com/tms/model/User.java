package com.tms.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private int id;
    private String firstName;
    private int age;
    private LocalDate created;
}
