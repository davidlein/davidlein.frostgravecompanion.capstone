package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Base;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<Base, Long>
{
}
