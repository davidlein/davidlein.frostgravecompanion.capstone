package com.davidlein.frostgravecompanion.services;

import com.davidlein.frostgravecompanion.models.*;
import com.davidlein.frostgravecompanion.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WizardService implements UserDetailsService
{
    @Autowired
    private SoldierRepository soldierRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private WarbandRepository warbandRepo;
    @Autowired
    private WizardRepository wizRepo;
    @Autowired
    private ApprenticeRepository appRepo;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        User user = userRepo.findByEmail(email);
        if(user==null)
        {
            throw new UsernameNotFoundException("User not found.");
        }
        return new CustomUserDetails(user);
    }
    public User getByEmail(String email)
    {
        return userRepo.findByEmail(email);
    }
//    primary way to get a userId and assign it when doing CRUD operations
    public User getPrincipal()
    {
        return getByEmail(SecurityContextHolder.getContext().getAuthentication().getName());
    }
    public List<Warband> getWarband(User userId)
    {
        Iterable<Warband> warbands = warbandRepo.findAllByUserId(userId);
        List<Warband> warbandList = new ArrayList<>();
        warbands.forEach(warbandList::add);
        return warbandList;
    }
    public List<Wizard> getWizard(User userId)
    {
        Iterable<Wizard> wizard = wizRepo.findAllByUserId(userId);
        List<Wizard> wizList = new ArrayList<>();
        wizard.forEach(wizList::add);
        return wizList;
    }
    public List<Apprentice> getApprentice(User userId)
    {
        Iterable<Apprentice> apprentice = appRepo.findAllByUserId(userId);
        List<Apprentice> appList = new ArrayList<>();
        apprentice.forEach(appList::add);
        return appList;
    }
    public List<Soldier> getSoldiers()
    {
        Iterable<Soldier> soldiers = this.soldierRepo.findAll();
        List<Soldier> soldierList = new ArrayList<>();
        soldiers.forEach(soldierList::add);
        return soldierList;
    }
}
