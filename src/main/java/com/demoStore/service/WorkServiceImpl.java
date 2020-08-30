package com.demoStore.service;

import com.demoStore.converter.WorkConverter;
import com.demoStore.dto.WorkDto;
import com.demoStore.entity.Work;
import com.demoStore.repository.JpaWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.demoStore.converter.WorkConverter.entityToDto;

@Service
public class WorkServiceImpl implements WorkService{

    @Autowired
    JpaWorkRepository jpaWorkRepository;

    @Override
    public WorkDto createWork(WorkDto workDto) {
        return WorkConverter.entityToDto(jpaWorkRepository.save(WorkConverter.dtoToEntity(workDto)));
    }

    @Override
    public List<WorkDto> getAllWorks() {
        List<Work> works = jpaWorkRepository.findAll();
        List<WorkDto> workDtos = new ArrayList<>();
        for (Work work:
                works) {
            workDtos.add(entityToDto(work));
        }
        return workDtos;
    }
}
