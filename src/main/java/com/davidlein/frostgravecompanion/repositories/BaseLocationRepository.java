package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.BaseLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseLocationRepository extends JpaRepository <BaseLocation,Long>
{
}
