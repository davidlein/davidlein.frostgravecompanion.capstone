package com.davidlein.frostgravecompanion.services;

import com.davidlein.frostgravecompanion.repositories.BaseRepository;
import com.davidlein.frostgravecompanion.repositories.BaseLocationRepository;
import com.davidlein.frostgravecompanion.repositories.BaseResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServices
{
    @Autowired
    private BaseRepository baseRepo;
    @Autowired
    private BaseResourcesRepository baseResourcesRepo;
    @Autowired
    private BaseLocationRepository baseLocationRepo;
}
