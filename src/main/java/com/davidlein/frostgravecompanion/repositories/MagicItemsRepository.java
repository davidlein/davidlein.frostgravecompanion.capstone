package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.MagicItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagicItemsRepository extends JpaRepository<MagicItems, Long>
{
}
