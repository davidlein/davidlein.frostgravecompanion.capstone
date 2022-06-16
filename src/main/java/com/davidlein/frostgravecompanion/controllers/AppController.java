package com.davidlein.frostgravecompanion.controllers;

import com.davidlein.frostgravecompanion.models.*;
import com.davidlein.frostgravecompanion.repositories.UserRepository;
import com.davidlein.frostgravecompanion.repositories.WarbandRepository;
import com.davidlein.frostgravecompanion.repositories.WizardRepository;
import com.davidlein.frostgravecompanion.services.SpellService;
import com.davidlein.frostgravecompanion.services.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController
{
    @Autowired
    SpellService spellService = new SpellService();
    @Autowired
    WizardService wizardService = new WizardService();
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private WizardRepository wizRepo;
    @Autowired
    private WarbandRepository warbandRepo;

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
    public ModelAndView warband()
    {
        ModelAndView mav = new ModelAndView("warband");
        List<Warband> warbandList = wizardService.getWarband(wizardService.getPrincipal());
        mav.addObject("warbands",warbandList);
        return mav;
    }
    @GetMapping("/warband_creator")
    public ModelAndView addWarbandMember(Model model)
    {
        List<Soldier> soldiers = wizardService.getSoldiers();
        model.addAttribute("soldiers", soldiers);

        User currentUser = wizardService.getPrincipal();
        model.addAttribute("currentUser", currentUser);
        ModelAndView mav = new ModelAndView("warband_creator");
        Warband newWarbandMember = new Warband();
        mav.addObject("warbands",newWarbandMember);
        return mav;
    }
    @PostMapping("/save_member")
    public String saveMember(@ModelAttribute Warband warband)
    {
        warbandRepo.save(warband);
        return "redirect:/warband";
    }
    @GetMapping("/base_vault")
    public String viewBaseVault()
    {
        return "base_vault";
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
        userRepo.save(user);
        return "register_success";
    }
}
