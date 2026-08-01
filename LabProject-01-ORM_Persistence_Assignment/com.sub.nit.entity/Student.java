package com.sub.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String name;

    private String course;

    private Double fee;

    
    public Student() {
    }

    
    public Student(Integer studentId, String name, String course, Double fee) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

   
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
e
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

   
    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

   
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name
                + ", course=" + course + ", fee=" + fee + "]";
    }
}
