package com.davidlein.frostgravecompanion.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="vault")
public class Vault
{
    @Id
    @Column(name="vault_id")
    private Long vaultId;

    @OneToOne
    @JoinColumn(name="wizard_id_fk",referencedColumnName = "wizard_id")
    Wizard wizardId;

    @OneToMany
    @JoinTable(name="vault_treasure", joinColumns = @JoinColumn(name="vault_id"), inverseJoinColumns =@JoinColumn(name="treasure_id"))
    List<Treasure> treasureId;


}
