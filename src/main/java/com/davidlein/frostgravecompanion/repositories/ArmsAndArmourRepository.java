package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.ArmsAndArmour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmsAndArmourRepository extends JpaRepository<ArmsAndArmour, Long>
{
}
