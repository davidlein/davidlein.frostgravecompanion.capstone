package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="spell_list")
public class SpellList
{
    @Id
    @Column(name="spell_id")
    private Long spellId;

    @Column(name="spell_name")
    private String spellName;


    @OneToOne
    @JoinColumn(name="school_id_fk",referencedColumnName = "school_id")
    School schoolId;

    @Column(name="base_cast")
    private Long baseCast;

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;

}
