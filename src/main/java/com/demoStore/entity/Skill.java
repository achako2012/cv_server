package com.demoStore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false, updatable=false)
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
        Skill skill1 = (Skill) o;
        return Objects.equals(id, skill1.id) &&
                Objects.equals(skill, skill1.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skill);
    }

}


