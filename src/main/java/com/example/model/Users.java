package com.example.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Users implements Serializable{

    private static final long serialVersionUID = -5292571110310058279L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telephone", nullable = false, unique = true)
    private String telephone;

    @Column(name = "address", nullable = false, unique = true)
    private String address;

    @Column(name = "birthdate", nullable = false)
    private String birthdate;


    public Users() {}

    public Users(String login, String password, String email, String telephone, String address, String birthdate) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.birthdate = birthdate;
    }
}
