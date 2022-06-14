package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@IdClass(SpellRollPK.class)
@Table(name="spell_roll")
public class SpellRoll
{
    @Id
    @Column(name="first_roll")
    private Long firstRoll;

    @Id
    @Column(name="second_roll")
    private Long secondRoll;

    @OneToOne
    @JoinColumn(name="spell_id_fk",referencedColumnName = "spell_id")
    SpellList spellId;

}
