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
    private Long warbandId;

    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn (name="wizard_id_fk",referencedColumnName = "wizard_id")
    private Wizard wizardId;

    @ManyToMany(targetEntity = Soldier.class)
    @JoinTable(	name = "warband_soldier", joinColumns = { @JoinColumn(name = "warband_id") },
            inverseJoinColumns = { @JoinColumn(name = "soldier_id") })
    private List<Soldier> soldiers;




}
