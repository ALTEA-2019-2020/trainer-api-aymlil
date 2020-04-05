package com.miage.altea.trainer_api.controller;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    private final TrainerService trainerS;

    TrainerController(TrainerService trainerS){
        this.trainerS = trainerS;
    }

    @GetMapping("/")
    Iterable<Trainer> getAllTrainers(){
        return this.trainerS.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name){
        return this.trainerS.getTrainer(name);
    }

    @PostMapping("/")
    public Trainer createTrainer(@RequestBody Trainer trainer){
        return trainerS.createTrainer(trainer);
    }
}