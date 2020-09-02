package com.demoStore.service;



import com.demoStore.dto.TrainingDto;

import java.util.List;

public interface TrainingService {
    List<TrainingDto> getAllTrainings();
    TrainingDto createTraining(TrainingDto trainingDto);

}
