package com.davidlein.frostgravecompanion.repositories;

import com.davidlein.frostgravecompanion.models.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.OneToMany;
import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long>
{
    @Override
    @Query ("SELECT s FROM School s")
    List<School> findAll();
}
