package com.example.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Users {
    @Id
    private int id;
    private String username;
    private String password;
}
