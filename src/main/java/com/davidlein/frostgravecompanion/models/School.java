package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="school")
public class School
{
    @Id
    @Column(name="school_id")
    private Long schoolId;

    @Column(name="school")
    private String school;

}
