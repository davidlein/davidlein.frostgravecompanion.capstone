package com.davidlein.frostgravecompanion;

<<<<<<< HEAD
import com.davidlein.frostgravecompanion.models.School;
import com.davidlein.frostgravecompanion.models.Soldier;
import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.repositories.SchoolRepository;
import com.davidlein.frostgravecompanion.repositories.SoldierRepository;
import com.davidlein.frostgravecompanion.repositories.UserRepository;
=======
import com.davidlein.frostgravecompanion.models.*;
import com.davidlein.frostgravecompanion.repositories.*;
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@Rollback(true)
public class RepositoryTests
{
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private SchoolRepository schoolRepo;
    @Autowired
    private SoldierRepository soldierRepo;
<<<<<<< HEAD
=======
    @Autowired
    private ApprenticeRepository appRepo;
    @Autowired
    private WizardRepository wizRepo;
    @Autowired
    private WarbandRepository warRepo;
>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() //passes
    {
        User user = new User();
        user.setEmail("user@email.com");
        user.setPassword("iamafish");
        user.setFirstName("Fish");
        user.setLastName("Man");

        User savedUser = userRepo.save(user);

        User existUser=entityManager.find(User.class,savedUser.getUserId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
    @Test
    public void testFindUserByEmailPass() //passes
    {
        String email = "user@email.com";
        User user = userRepo.findByEmail(email);
        assertThat(user).isNotNull();
    }
    @Test
    public void testFindUserByEmailFail() //fails
    {
        String email = "user1@email.com";
        User user = userRepo.findByEmail(email);
        assertThat(user).isNotNull();
    }
    @Test
    public void testFindAllSchools()
    {
        List<School> school = schoolRepo.findAll();
        assertThat(school).isNotNull();
        System.out.println(school);
    }

    @Test
    public void testFindAllSoldiers()
    {
        List<Soldier> soldier = soldierRepo.findAll();
        assertThat(soldier).isNotNull();
        System.out.println(soldier.get(0));
        System.out.println(soldier.get(1));
        System.out.println(soldier);
    }
<<<<<<< HEAD
=======
    @Test
    public void testFindApprentice()
    {
        User user = new User();
        user.setUserId(8L);
        List<Apprentice> apprentice = appRepo.findAllByUserId(user);
        assertThat(apprentice).isNotNull();
        System.out.println(apprentice);
    }
    @Test
    public void testFindWizard()
    {
        User user = new User();
        user.setUserId(8L);
        List<Wizard> wizard = wizRepo.findAllByUserId(user);
        assertThat(wizard).isNotNull();
        System.out.println(wizard);
    }
    @Test
    public void testFindWarband()
    {
        User user = new User();
        user.setUserId(8L);
        List<Warband> warband = warRepo.findAllByUserId(user);
        assertThat(warband).isNotNull();
        System.out.println(warband);
    }

>>>>>>> 23d8b0d975b91acbe40e5e1c5bbd0ea4a7d8295d



}
