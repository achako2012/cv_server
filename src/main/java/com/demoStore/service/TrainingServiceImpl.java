package com.demoStore.service;


import com.demoStore.converter.TrainingConverter;
import com.demoStore.dto.TrainingDto;
import com.demoStore.entity.Training;
import com.demoStore.repository.JpaTrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.demoStore.converter.TrainingConverter.entityToDto;

@Service
public class TrainingServiceImpl implements TrainingService{

    @Autowired
    JpaTrainingRepository jpaTrainingRepository;

    @Override
    public TrainingDto createTraining(TrainingDto trainingDto) {
        return TrainingConverter.entityToDto(jpaTrainingRepository.save(TrainingConverter.dtoToEntity(trainingDto)));
    }

    @Override
    public List<TrainingDto> getAllTrainings() {
        List<Training> trainings = jpaTrainingRepository.findAll();
        List<TrainingDto> trainingDtos = new ArrayList<>();
        for (Training training:
                trainings) {
            trainingDtos.add(entityToDto(training));
        }
        return trainingDtos;
    }
}
