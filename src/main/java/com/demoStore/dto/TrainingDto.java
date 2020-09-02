package com.demoStore.dto;

public class TrainingDto {
    private Long id;
    private String training;

    public TrainingDto() {
    }

    public TrainingDto(Long id, String training) {
        this.id = id;
        this.training = training;
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

    @Override
    public String toString() {
        return "TrainingDto{" +
                "id=" + id +
                ", training='" + training + '\'' +
                '}';
    }
}
