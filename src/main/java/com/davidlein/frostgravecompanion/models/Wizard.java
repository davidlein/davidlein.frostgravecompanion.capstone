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
<<<<<<< HEAD
    private Long wizardId;

    @Column(name="wiz_name")
    private String wizName;

    @Column(name="apprentice_name")
    private String apprenticeName;

    @OneToOne
    @JoinColumn(name="school_id_fk",referencedColumnName = "school_id")
    School schoolId;
=======
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long wizardId;

>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d

    @ManyToOne
    @JoinColumn (name="user_id_fk",referencedColumnName = "user_id")
    private User userId;

<<<<<<< HEAD
=======
    @Column(name="wiz_name")
    private String wizName;

    @Column(name="school")
    private String school;

    @Column(name="xp")
    private Long xp;

>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d
    @Column(name="level")
    private Long level;

    @Column(name="treasury")
    private Long treasury;

<<<<<<< HEAD
    @ManyToMany(targetEntity = SpellList.class)
    @JoinTable(	name = "wizard_spells", joinColumns = { @JoinColumn(name = "spell_list_fk") },
            inverseJoinColumns = { @JoinColumn(name = "spell_id") })
    private List<SpellList> spellList;

=======
    @Column (name="move")
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

    @Column(name="notes")
    private String notes;
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d

}
