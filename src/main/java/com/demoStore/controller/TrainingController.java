package com.demoStore.controller;


import com.demoStore.dto.TrainingDto;
import com.demoStore.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class TrainingController {

    @Autowired
    TrainingService trainingService;


    @PostMapping("/training")
    public @ResponseBody
    TrainingDto saveTraining(@RequestBody TrainingDto trainingDto) {
        return trainingService.createTraining(trainingDto);
    }

    @GetMapping("/training")
    public @ResponseBody
    List<TrainingDto> getAllTrainings() {
        return trainingService.getAllTrainings();
    }
}
