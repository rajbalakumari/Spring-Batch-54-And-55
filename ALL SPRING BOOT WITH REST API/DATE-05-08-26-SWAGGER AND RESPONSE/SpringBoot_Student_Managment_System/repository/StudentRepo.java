package com.nit.SpringBoot_Student_Managment_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.SpringBoot_Student_Managment_System.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
