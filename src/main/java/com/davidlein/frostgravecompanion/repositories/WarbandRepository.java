package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Warband;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarbandRepository extends JpaRepository<Warband,Long>
{
}
