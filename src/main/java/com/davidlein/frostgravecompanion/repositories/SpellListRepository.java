package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.SpellList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellListRepository extends JpaRepository<SpellList, Long>
{
}
