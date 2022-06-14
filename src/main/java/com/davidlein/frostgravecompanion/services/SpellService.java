package com.davidlein.frostgravecompanion.services;

import com.davidlein.frostgravecompanion.models.School;
import com.davidlein.frostgravecompanion.repositories.SchoolRepository;
import com.davidlein.frostgravecompanion.repositories.SpellListRepository;
import com.davidlein.frostgravecompanion.repositories.SpellRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpellService
{
    @Autowired
    private SchoolRepository schoolRepo;
    @Autowired
    private SpellListRepository spellListRepo;
    @Autowired
    private SpellRollRepository spellRollRepo;

    public List<School> getSchools()
    {
        Iterable<School> schools = this.schoolRepo.findAll();
        List<School> schoolList = new ArrayList<>();
        schools.forEach(schoolList::add);
        return schoolList;
    }
}
