package com.davidlein.frostgravecompanion.controllers;

import com.davidlein.frostgravecompanion.models.School;
import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.repositories.UserRepository;
import com.davidlein.frostgravecompanion.services.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController
{
    @Autowired
    SpellService spellService = new SpellService();
    @Autowired
    private UserRepository repo;

    @GetMapping("")
    public String viewStartPage()
    {
        return "index";
    }
    @GetMapping("/home")
    public String viewHomePage()
    {
        return "index";
    }
    @GetMapping("/warband")
    public String viewWarband(Model model)
    {
        List<School> schools = spellService.getSchools();
        model.addAttribute("schools", schools);
        return "warband";
    }
    @GetMapping("/base_vault")
    public String viewBaseVault()
    {
        return "base_vault";
    }
    @GetMapping("/warband_select")
    public String viewWarbandSelect()
    {
        return "warband_select";
    }
    @GetMapping("/warband_creator")
    public String viewWarbandCreator()
    {
        return "warband_creator";
    }
    @GetMapping("/venture_forth")
    public String viewVentureForth()
    {
        return "venture_forth";
    }
    @GetMapping("/register")
    public String showSignUpForm(Model model)
    {
        model.addAttribute("user", new User());
        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegistration (User user)
    {
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "register_success";
    }
}
