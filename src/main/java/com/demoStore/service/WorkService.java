package com.demoStore.service;

import com.demoStore.dto.WorkDto;
import com.demoStore.entity.Work;

import java.util.List;

public interface WorkService {
    List<WorkDto> getAllWorks();
    WorkDto createWork(WorkDto workDto);

}
