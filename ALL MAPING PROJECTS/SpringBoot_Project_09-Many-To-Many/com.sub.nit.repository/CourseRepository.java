package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
