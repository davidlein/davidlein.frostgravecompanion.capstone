package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="magic_arms_and_armour")
public class MagicArmsAndArmour
{
    @Id
    @Column(name="magic_arms_id")
    private Long magicArmsId;

    @Column(name="die_roll")
    private Long dieRoll;

    @Column(name="name")
    private String name;

    @Column(name="effect")
    private String effect;

    @Column(name="purchase_price")
    private Long purchasePrice;

    @Column(name="sale_price")
    private int salePrice;

    @OneToOne
    @JoinColumn(name="treasure_id_fk",referencedColumnName = "treasure_id")
    Treasure treasureId;

}
