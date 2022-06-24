package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="apprentice")
public class Apprentice
{
    @Id
    @Column(name="apprentice_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apprenticeId;

    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;


    @Column(name="apprentice_name")
    private String appName;

    @Column(name="notes")
    private String notes;
    @Column (name="move")
    private Long move;

    @Column(name="fight")
    private String fight;

    @Column(name="shoot")
    private String shoot;

    @Column(name="armour")
    private Long armour;

    @Column(name="will")
    private String will;

    @Column(name="health")
    private Long health;
}
