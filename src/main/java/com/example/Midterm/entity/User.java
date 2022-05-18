package com.example.Midterm.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String filename;


    public User(String name, String password, String email, String filename) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.filename = filename;
    }

}
