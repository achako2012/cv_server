package com.demoStore.repository;

import com.demoStore.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSkillRepository extends JpaRepository<Skill, Long> {
}
