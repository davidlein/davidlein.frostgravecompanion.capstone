package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long>
{
}
