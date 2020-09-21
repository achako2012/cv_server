package com.demoStore.dto;

public class WorkDto {
    private Long id;
    private String company;
    private String position;
    private String responsobilities;
    private String date;

    public WorkDto() {
    }

    public WorkDto(Long id, String company, String position, String responsobilities, String date) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.responsobilities = responsobilities;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsobilities() {
        return responsobilities;
    }

    public void setResponsobilities(String responsobilities) {
        this.responsobilities = responsobilities;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WorkDto{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", responsobilities='" + responsobilities + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
