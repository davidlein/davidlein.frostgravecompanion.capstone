package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.PotionRoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionRollRepository extends JpaRepository<PotionRoll, Long>
{
}
