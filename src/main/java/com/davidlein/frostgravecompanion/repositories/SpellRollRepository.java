package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.SpellRoll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellRollRepository extends JpaRepository<SpellRoll, Long>
{
}
