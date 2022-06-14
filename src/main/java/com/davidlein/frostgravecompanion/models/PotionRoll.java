package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(PotionRollPK.class) //for composite keys
@Table(name="potion_roll")
public class PotionRoll
{
    @Id
    @Column(name="first_roll")
    private Long firstRoll;

    @Id
    @Column(name="second_roll")
    private Long secondRoll;

    @OneToOne
    @JoinColumn(name="potion_id_fk",referencedColumnName = "potion_id")
    Potion potionId;

}
