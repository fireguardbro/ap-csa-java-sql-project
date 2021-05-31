package com.myrhs;
import java.time.LocalDateTime;

//RHS student class
public class Student {

    private Long id;
    private String name;
    private Double gpa;
    private LocalDateTime createdDate;

    public Student() {
    }

    public Student(Long id, String name, Double gpa, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.createdDate = createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", createdDate=" + createdDate +
                '}';
    }
}
