package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="potion")
public class Potion
{
    @Id
    @Column(name="potion_id")
    private Long potionId;

    @Column(name="potion")
    private String potion;

    @Column(name="purchase_price")
    private Long purchasePrice;

    @Column(name="sale_price")
    private Long salePrice;

    @Column(name="ingredient_cost")
    private Long ingredientCost;

    @Column(name="description")
    private String description;

    @Column(name="greater_potion")
    private Boolean greaterPotion;

    @OneToOne
    @JoinColumn(name="treasure_id_fk",referencedColumnName = "treasure_id")
    Treasure treasureId;

}
