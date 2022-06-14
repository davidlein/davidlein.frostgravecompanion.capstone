package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="wizard")
public class Wizard
{
    @Id
    @Column(name="wizard_id")
    private Long wizardId;

    @Column(name="wiz_name")
    private String wizName;

    @Column(name="apprentice_name")
    private String apprenticeName;

    @OneToOne
    @JoinColumn(name="school_id_fk",referencedColumnName = "school_id")
    School schoolId;

    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;

    @Column(name="level")
    private Long level;

    @Column(name="treasury")
    private Long treasury;

    @ManyToMany(targetEntity = SpellList.class)
    @JoinTable(	name = "wizard_spells", joinColumns = { @JoinColumn(name = "spell_list_fk") },
            inverseJoinColumns = { @JoinColumn(name = "spell_id") })
    private List<SpellList> spellList;


}
