package com.demoStore.dto;

public class TrainingDto {
    private Long id;
    private String training;
    private String school;

    public TrainingDto() {
    }

    public TrainingDto(Long id, String training, String school) {
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
    public String toString() {
        return "TrainingDto{" +
                "id=" + id +
                ", training='" + training + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
