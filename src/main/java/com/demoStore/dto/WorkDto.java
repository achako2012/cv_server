package com.demoStore.dto;

public class WorkDto {
    private Long id;
    private String work;

    public WorkDto() {
    }

    public WorkDto(Long id, String work) {
        this.id = id;
        this.work = work;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "WorkDto{" +
                "id=" + id +
                ", work='" + work + '\'' +
                '}';
    }
}
