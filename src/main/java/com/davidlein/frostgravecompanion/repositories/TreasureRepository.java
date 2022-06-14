package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Treasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreasureRepository extends JpaRepository<Treasure,Long>
{
}
