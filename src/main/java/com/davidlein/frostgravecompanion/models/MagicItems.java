package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="magic_items")
public class MagicItems
{
    @Id
    @Column(name="magic_item_id")
    private Long magicItemId;

    @Column(name="die_roll")
    private Long dieRoll;

    @Column(name="magic_item")
    private String magicItem;

    @Column(name="purchase_price")
    private Long purchasePrice;

    @Column(name="sale_price")
    private Long salePrice;

    @Column(name="description")
    private String description;

    @OneToOne
    @JoinColumn(name="treasure_id_fk",referencedColumnName = "treasure_id")
    Treasure treasureId;

}
