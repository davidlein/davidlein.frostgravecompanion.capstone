package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name="base")
public class Base
{
    @Id
    @Column(name="base_id")
    private Long baseId;

    @OneToOne
    @JoinColumn (name="wizard_id_fk", referencedColumnName = "wizard_id")
    Wizard wizardId;

    @OneToOne
    @JoinColumn(name="base_loc_id_fk", referencedColumnName = "base_loc_id")
    BaseLocation baseLocation;

    @Column(name="base_resources_id_fk")
    private Long baseResourceId;


}
