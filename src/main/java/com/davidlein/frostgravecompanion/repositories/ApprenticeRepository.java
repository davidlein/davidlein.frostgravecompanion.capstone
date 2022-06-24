package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.Apprentice;
import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.models.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprenticeRepository extends JpaRepository<Apprentice, Long>
{
    List<Apprentice> findAllByUserId(User userId);
}
