package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="user")
public class User
{
    @Id
    @Column (name="user_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

}
