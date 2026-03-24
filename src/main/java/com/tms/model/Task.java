package com.tms.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {
    private int id;
    private String message;
    private int userId;
    private LocalDateTime date;
}
