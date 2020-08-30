package com.demoStore.converter;

import com.demoStore.dto.WorkDto;
import com.demoStore.entity.Work;

public class WorkConverter {

    public static Work dtoToEntity(WorkDto workDto){
        Work work = new Work();
        work.setId(workDto.getId());
        work.setWork(workDto.getWork());
        return work;
    }

    public static WorkDto entityToDto(Work work){
        WorkDto workDto = new WorkDto();
        workDto.setId(work.getId());
        workDto.setWork(work.getWork());
        return workDto;
    }
}
