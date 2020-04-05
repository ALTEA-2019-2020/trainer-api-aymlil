package com.miage.altea.trainer_api.service;

import com.miage.altea.trainer_api.bo.Trainer;
import com.miage.altea.trainer_api.repository.TrainerRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService{
    private TrainerRepository trainerR;

    public TrainerServiceImpl(TrainerRepository trainerR) {
        this.trainerR = trainerR;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return this.trainerR.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        return this.trainerR.findById(name).orElse(null);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return this.trainerR.save(trainer);
    }
}
