package com.example.teluskotrainingspringboot.repository;

import com.example.teluskotrainingspringboot.models.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlienRepo extends JpaRepository<Alien, Integer> {

    @Query("from Alien where tech=?1 order by name")
     List<Alien> findByTechSorted(String tech);
}
