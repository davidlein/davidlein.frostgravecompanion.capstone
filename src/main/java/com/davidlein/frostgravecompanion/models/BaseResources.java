package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name="base_resources")
public class BaseResources
{
    @Id
    @Column (name="base_resource_id")
    private Long resourceId;

    @ManyToOne
    @JoinColumn(name="resource_id",referencedColumnName = "base_resources_id_fk")
    Base baseResourceId;

    @Column(name="resource")
    private String resource;

    @Column (name="effects")
    private String effects;

    @Column (name="purchase_price")
    private Long purchasePrice;

}
