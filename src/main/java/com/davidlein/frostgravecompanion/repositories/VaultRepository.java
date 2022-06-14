package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Vault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaultRepository extends JpaRepository<Vault, Long>
{
}
