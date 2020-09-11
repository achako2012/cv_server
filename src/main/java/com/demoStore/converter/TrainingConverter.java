package com.demoStore.converter;


import com.demoStore.dto.TrainingDto;
import com.demoStore.entity.Training;

public class TrainingConverter {

    public static Training dtoToEntity(TrainingDto trainingDto){
        Training training = new Training();
        training.setId(trainingDto.getId());
        training.setTraining(trainingDto.getTraining());
        training.setSchool(trainingDto.getSchool());
        return training;
    }

    public static TrainingDto entityToDto(Training training){
        TrainingDto trainingDto = new TrainingDto();
        trainingDto.setId(training.getId());
        trainingDto.setTraining(training.getTraining());
        trainingDto.setSchool(training.getSchool());
        return trainingDto;
    }
}
