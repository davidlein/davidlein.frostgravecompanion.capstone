package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="warband")
public class Warband
{
    @Id
    @Column(name="warband_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long warbandId;

    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;

    @Column(name="type")
    private String type;

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

    @Column(name="cost")
    private Long cost;

    @Column(name="notes")
    private String notes;

    @Column(name="specialist")
    private Boolean specialist;


}
