package com.davidlein.frostgravecompanion.repositories;

<<<<<<< HEAD
=======
import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.models.Warband;
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d
import com.davidlein.frostgravecompanion.models.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long>
{
=======
import java.util.List;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long>
{
    List<Wizard> findAllByUserId(User userId);
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d
}
