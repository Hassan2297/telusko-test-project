package com.example.teluskotrainingspringboot.service;

import com.example.teluskotrainingspringboot.models.Alien;
import com.example.teluskotrainingspringboot.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlienService {
    @Autowired
    private AlienRepo alienRepo;

    public void addAlien(Alien alien){
        alienRepo.save(alien);
    }

    public Optional<Alien> getAlien(int id){

        Optional<Alien> alien = alienRepo.findById(id);

        return alien;
    }

    public List<Alien> findByTechSorted(String tech){
        List<Alien> aliens = alienRepo.findByTechSorted(tech);
        return aliens;
    }
}
