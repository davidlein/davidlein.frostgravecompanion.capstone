package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="soldier")
public class Soldier
{
    @Id
    @Column(name="soldier_id")
    private Long soldierId;

    @Column(name="soldier_type")
    private String soldierType;

    @Column(name="move")
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
