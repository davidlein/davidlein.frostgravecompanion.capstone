package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "base_location")
public class BaseLocation
{
    @Id
    @Column(name="base_loc_id")
    private Long baseId;


    @Column(name="base")
    private String base;

    @Column(name="effects")
    private String effects;

}
