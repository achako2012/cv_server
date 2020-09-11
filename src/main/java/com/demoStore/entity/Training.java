package com.demoStore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String training;

    @Column(nullable = false)
    private String school;

    public Training() {
    }

    public Training(Long id, String training, String school) {
        this.id = id;
        this.training = training;
        this.school = school;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Training training1 = (Training) o;
        return Objects.equals(id, training1.id) &&
                Objects.equals(training, training1.training) &&
                Objects.equals(school, training1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, training, school);
    }

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", training='" + training + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

}

