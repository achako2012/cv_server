package com.demoStore.converter;

import com.demoStore.dto.WorkDto;
import com.demoStore.entity.Work;

public class WorkConverter {

    public static Work dtoToEntity(WorkDto workDto){
        Work work = new Work();
        work.setId(workDto.getId());
        work.setCompany(workDto.getCompany());
        work.setPosition(workDto.getPosition());
        work.setResponsobilities(workDto.getResponsobilities());
        work.setDate(workDto.getDate());
        return work;
    }

    public static WorkDto entityToDto(Work work){
        WorkDto workDto = new WorkDto();
        workDto.setId(work.getId());
        workDto.setCompany(work.getCompany());
        workDto.setPosition(work.getPosition());
        workDto.setResponsobilities(work.getResponsobilities());
        workDto.setDate(work.getDate());
        return workDto;
    }
}
