package com.demoStore.service;

import com.demoStore.dto.SkillDto;
import com.demoStore.dto.WorkDto;

import java.util.List;

public interface SkillService {
    List<SkillDto> getAllSkills();
    SkillDto createSkill(SkillDto skillDto);

}
