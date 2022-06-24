package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="wizard")
public class Wizard
{
    @Id
    @Column(name="wizard_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long wizardId;

    @Column(name="wiz_name")
    private String wizName;


    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;


    @Column(name="school")
    private String school;

    @Column(name="xp")
    private Long xp;

    @Column(name="level")
    private Long level;

    @Column(name="treasury")
    private Long treasury;


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

    @Column(name="notes")
    private String notes;


}
