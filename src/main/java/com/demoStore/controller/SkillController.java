package com.demoStore.controller;

import com.demoStore.dto.SkillDto;
import com.demoStore.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class SkillController {

    @Autowired
    SkillService skillService;


    @PostMapping("/skill")
    public @ResponseBody
    SkillDto saveSkill(@RequestBody SkillDto skillDto){
        return skillService.createSkill(skillDto);
    }

    @GetMapping("/skills")
    public @ResponseBody
    List<SkillDto> getAllSkills(){
        return skillService.getAllSkills();
    }

}
