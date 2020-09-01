package com.demoStore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String skill;

    public Skill() {
    }

    public Skill(Long id, String skill) {
        this.id = id;
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "SkillDto{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(id, skill.id) &&
                Objects.equals(this.skill, skill.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skill);
    }

}


