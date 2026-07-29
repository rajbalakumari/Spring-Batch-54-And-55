package com.sub.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer c_id;

    private String c_name;

    public Course() {
    }

    public Course(Integer c_id, String c_name) {
        this.c_id = c_id;
        this.c_name = c_name;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    @Override
    public String toString() {
        return "Course [c_id=" + c_id + ", c_name=" + c_name + "]";
    }
}
