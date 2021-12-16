package com.example.teluskotrainingspringboot.resources;

import com.example.teluskotrainingspringboot.models.Alien;
import com.example.teluskotrainingspringboot.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    private AlienService alienService;

    @GetMapping("/home")
    public String home(){

        return "Hello Hassan";
    }

    @PostMapping("/add")
    public String addAlien(@RequestBody Alien alien){
        alienService.addAlien(alien);
        return "Alien added!";
    }

    @GetMapping("/getAlien/{id}")
    public Optional<Alien> getAlienById(@PathVariable int id){
        Optional<Alien> alien = alienService.getAlien(id);
        return alien;
    }

    @GetMapping("/getAliens/by/{tech}")
    public List<Alien> getAliensByTech(@PathVariable String tech){
        List<Alien> aliens = alienService.findByTechSorted(tech);
        return aliens;
    }
}
