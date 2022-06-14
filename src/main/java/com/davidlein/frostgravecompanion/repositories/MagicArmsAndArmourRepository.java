package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.MagicArmsAndArmour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicArmsAndArmourRepository extends JpaRepository<MagicArmsAndArmour, Long>
{
}
