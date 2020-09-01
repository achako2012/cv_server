package com.demoStore.service;

import com.demoStore.converter.SkillConverter;
import com.demoStore.dto.SkillDto;
import com.demoStore.entity.Skill;
import com.demoStore.repository.JpaSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.demoStore.converter.SkillConverter.entityToDto;

@Service
public class SkillServiceImpl implements SkillService{

    @Autowired
    JpaSkillRepository jpaSkillRepository;

    @Override
    public SkillDto createSkill(SkillDto skillDto) {
        return SkillConverter.entityToDto(jpaSkillRepository.save(SkillConverter.dtoToEntity(skillDto)));
    }

    @Override
    public List<SkillDto> getAllSkills() {
        List<Skill> skills = jpaSkillRepository.findAll();
        List<SkillDto> skillDtos = new ArrayList<>();
        for (Skill skill:
                skills) {
            skillDtos.add(entityToDto(skill));
        }
        return skillDtos;
    }
}
