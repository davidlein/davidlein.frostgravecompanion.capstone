package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="treasure")
public class Treasure
{
    @Id
    @Column(name="treasure_id")
    private Long treasureId;

    @Column(name="treasure_name")
    private String treasureName;
}
