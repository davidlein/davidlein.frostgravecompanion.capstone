package com.davidlein.frostgravecompanion.services;

import com.davidlein.frostgravecompanion.repositories.SoldierRepository;
import com.davidlein.frostgravecompanion.models.CustomUserDetails;
import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.repositories.WarbandRepository;
import com.davidlein.frostgravecompanion.repositories.WizardRepository;
import com.davidlein.frostgravecompanion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

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
    private WizardRepository wizardRepo;


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
}
