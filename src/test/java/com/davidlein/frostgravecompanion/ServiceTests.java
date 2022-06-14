package com.davidlein.frostgravecompanion;

import com.davidlein.frostgravecompanion.models.School;
import com.davidlein.frostgravecompanion.repositories.SchoolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ServiceTests
{
    @Autowired
    private SchoolRepository schoolRepo;

    @Test
    public void testGetSchools()
    {
        Iterable<School> schools = this.schoolRepo.findAll();
        List<School> schoolList = new ArrayList<>();
        schools.forEach(schoolList::add);
        System.out.println(schoolList);
    }
}
