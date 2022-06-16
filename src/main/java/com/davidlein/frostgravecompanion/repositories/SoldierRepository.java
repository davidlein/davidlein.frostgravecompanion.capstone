package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.School;
import com.davidlein.frostgravecompanion.models.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, Long>
{
    @Override
    @Query("SELECT s FROM Soldier s")
    List<Soldier> findAll();
}
