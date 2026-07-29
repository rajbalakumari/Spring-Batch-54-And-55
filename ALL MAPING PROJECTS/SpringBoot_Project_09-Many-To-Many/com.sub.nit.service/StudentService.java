package com.sub.nit.service;

import java.util.List;

import com.sub.nit.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();
}
