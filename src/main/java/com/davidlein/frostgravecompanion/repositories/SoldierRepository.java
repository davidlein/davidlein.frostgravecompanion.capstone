package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, Long>
{
}
