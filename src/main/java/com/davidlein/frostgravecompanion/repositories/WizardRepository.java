package com.davidlein.frostgravecompanion.repositories;


import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.models.Warband;
import com.davidlein.frostgravecompanion.models.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long>
{
    List<Wizard> findAllByUserId(User userId);

}
