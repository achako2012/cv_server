package com.demoStore.controller;

import com.demoStore.dto.WorkDto;
import com.demoStore.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WorkController {

    @Autowired
    WorkService workService;

    @PostMapping
    public @ResponseBody
    WorkDto saveWork(@RequestBody WorkDto workDto){
        return workService.createWork(workDto);
    }

    @GetMapping("/message")
    public @ResponseBody
    List<WorkDto> getAllWorks(){
        return workService.getAllWorks();
    }

}
