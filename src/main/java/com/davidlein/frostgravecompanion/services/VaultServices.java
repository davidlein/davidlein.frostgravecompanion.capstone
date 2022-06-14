package com.davidlein.frostgravecompanion.services;

import com.davidlein.frostgravecompanion.repositories.ArmsAndArmourRepository;
import com.davidlein.frostgravecompanion.repositories.MagicArmsAndArmourRepository;
import com.davidlein.frostgravecompanion.repositories.MagicItemsRepository;
import com.davidlein.frostgravecompanion.repositories.PotionRepository;
import com.davidlein.frostgravecompanion.repositories.PotionRollRepository;
import com.davidlein.frostgravecompanion.repositories.TreasureRepository;
import com.davidlein.frostgravecompanion.repositories.VaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaultServices
{
    @Autowired
    private ArmsAndArmourRepository armsRepo;
    @Autowired
    private MagicArmsAndArmourRepository magicArmsRepo;
    @Autowired
    private MagicItemsRepository magicItemsRepo;
    @Autowired
    private PotionRepository potionRepo;
    @Autowired
    private PotionRollRepository potionRollRepo;
    @Autowired
    private TreasureRepository treasureRepo;
    @Autowired
    private VaultRepository vaultRepo;
}
