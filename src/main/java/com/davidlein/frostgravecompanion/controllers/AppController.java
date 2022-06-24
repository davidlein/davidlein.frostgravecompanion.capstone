package com.davidlein.frostgravecompanion.controllers;

import com.davidlein.frostgravecompanion.FrostgraveAppApplication;
import com.davidlein.frostgravecompanion.models.*;

import com.davidlein.frostgravecompanion.repositories.ApprenticeRepository;

import com.davidlein.frostgravecompanion.repositories.UserRepository;
import com.davidlein.frostgravecompanion.repositories.WarbandRepository;
import com.davidlein.frostgravecompanion.repositories.WizardRepository;
import com.davidlein.frostgravecompanion.services.SpellService;
import com.davidlein.frostgravecompanion.services.WizardService;
import lombok.extern.java.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

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


    @Autowired
    private ApprenticeRepository appRepo;

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

        List<Wizard> wizList = wizardService.getWizard(wizardService.getPrincipal());
        List<Apprentice> appList = wizardService.getApprentice((wizardService.getPrincipal()));

        mav.addObject("warbands",warbandList);
        mav.addObject("wizard",wizList);
        mav.addObject("apprentice",appList);

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

    @GetMapping("/wizard_creator")
    public ModelAndView addWizard(Model model)
    {
        List<School> schools = spellService.getSchools();
        model.addAttribute("schools", schools);

        User currentUser = wizardService.getPrincipal();
        model.addAttribute("currentUser", currentUser);
        ModelAndView mav = new ModelAndView("wizard_creator");
        Wizard newWizard = new Wizard();
        mav.addObject("wizard",newWizard);
        return mav;
    }
    @GetMapping("/apprentice_creator")
    public ModelAndView addApprentice(Model model)
    {
        User currentUser = wizardService.getPrincipal();
        model.addAttribute("currentUser", currentUser);
        ModelAndView mav = new ModelAndView("apprentice_creator");
        Apprentice newApprentice = new Apprentice();
        mav.addObject("apprentice",newApprentice);
        return mav;
    }
    @GetMapping("/updateWizard")
    public ModelAndView updateWizard(@RequestParam Long wizardId, Model model)
    {
        User currentUser = wizardService.getPrincipal();
        model.addAttribute("currentUser", currentUser);
        ModelAndView mav = new ModelAndView("wizard_update");
        Wizard wizard = wizRepo.findById(wizardId).get();
        mav.addObject("wizard",wizard);
        return mav;
    }
    @GetMapping("/updateApprentice")
    public ModelAndView updateApprentice(@RequestParam Long apprenticeId, Model model)
    {
        User currentUser = wizardService.getPrincipal();
        model.addAttribute("currentUser", currentUser);
        ModelAndView mav = new ModelAndView("apprentice_update");
        Apprentice apprentice = appRepo.findById(apprenticeId).get();
        mav.addObject("apprentice",apprentice);
        return mav;
    }

    @PostMapping("/save_member")
    public String saveMember(@ModelAttribute Warband warband)
    {
        warbandRepo.save(warband);
        return "redirect:/warband";
    }

    @PostMapping("/save_wizard")
    public String saveMember(@ModelAttribute Wizard wizard)
    {
        wizRepo.save(wizard);
        return "redirect:/warband";
    }
    @PostMapping("/save_apprentice")
    public String saveMember(@ModelAttribute Apprentice apprentice)
    {
        appRepo.save(apprentice);
        return "redirect:/warband";
    }

    @GetMapping("/removeMember")
    public String removeMember(@RequestParam Long warbandId)
    {
        warbandRepo.deleteById(warbandId);
        return "redirect:/warband";
    }
    @GetMapping("/removeWizard")
    public String removeWizard(@RequestParam Long wizardId)
    {
        wizRepo.deleteById(wizardId);
        return "redirect:/warband";
    }
    @GetMapping("/removeApprentice")
    public String removeApprentice(@RequestParam Long apprenticeId)
    {
        appRepo.deleteById(apprenticeId);
        return "redirect:/warband";
    }

    @GetMapping("/venture_forth")
    public ModelAndView ventureForth()
    {
        ModelAndView mav = new ModelAndView("venture_forth");
        List<Wizard> wizList = wizardService.getWizard(wizardService.getPrincipal());
        List<Apprentice> appList = wizardService.getApprentice((wizardService.getPrincipal()));
        List<Warband> warbandList = wizardService.getWarband(wizardService.getPrincipal());
        mav.addObject("warbands",warbandList);
        mav.addObject("wizard",wizList);
        mav.addObject("apprentice",appList);
        return mav;
    }






    @GetMapping("/base_vault")
    public String viewBaseVault()
    {
        return "base_vault";
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
