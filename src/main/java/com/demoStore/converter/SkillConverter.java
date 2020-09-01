package com.demoStore.converter;

import com.demoStore.dto.SkillDto;
import com.demoStore.entity.Skill;

public class SkillConverter {

    public static Skill dtoToEntity(SkillDto skillDto){
        Skill skill = new Skill();
        skill.setId(skillDto.getId());
        skill.setSkill(skillDto.getSkill());
        return skill;
    }

    public static SkillDto entityToDto(Skill skill){
        SkillDto skillDto = new SkillDto();
        skillDto.setId(skill.getId());
        skillDto.setSkill(skill.getSkill());
        return skillDto;
    }
}
