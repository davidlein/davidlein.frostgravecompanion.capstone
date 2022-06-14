package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name="arms_and_armour")
public class ArmsAndArmour
{
    @Id
    @Column(name="arms_id")
    private Long armsId;

    @Column(name="name")
    private String name;

    @Column(name="damage_mod")
    private String damageMod;

    @Column(name="range")
    private String range;

    @Column(name="armour_mod")
    private String armourMod;

    @Column(name="notes")
    private String notes;

    @OneToOne
    @JoinColumn(name="treasure_id_fk",referencedColumnName = "treasure_id")
    Treasure treasureId;

}
