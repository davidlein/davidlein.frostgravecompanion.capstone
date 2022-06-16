package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.User;
import com.davidlein.frostgravecompanion.models.Warband;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarbandRepository extends JpaRepository<Warband,Long>
{
    List<Warband> findAllByUserId(User userId);
}
