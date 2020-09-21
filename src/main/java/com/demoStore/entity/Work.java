package com.demoStore.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Work")
public class Work {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String responsobilities;

    @Column
    private String date;



    public Work() {
    }

    public Work(Long id, String company, String position, String responsobilities, String date) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return Objects.equals(id, work.id) &&
                Objects.equals(company, work.company) &&
                Objects.equals(position, work.position) &&
                Objects.equals(responsobilities, work.responsobilities) &&
                Objects.equals(date, work.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, position, responsobilities, date);
    }
}


