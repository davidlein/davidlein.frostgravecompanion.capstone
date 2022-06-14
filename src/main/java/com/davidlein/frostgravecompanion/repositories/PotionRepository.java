package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Potion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PotionRepository extends JpaRepository<Potion,Long>
{
}
