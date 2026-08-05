package com.nit.SpringBoot_Student_Managment_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.SpringBoot_Student_Managment_System.entity.Student;
import com.nit.SpringBoot_Student_Managment_System.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	{
		Student s1=service.saveStudent(s);
		return new ResponseEntity<Student>( s1, HttpStatus.OK);
	}
	
	@GetMapping("/student/getAll")
	public ResponseEntity<List<Student>>getAllStudent()
	{
		List<Student> s1=service.getAllStudent();
		return new ResponseEntity<List<Student>>(s1, HttpStatus.OK);
	}
	
	@GetMapping("/student/getById/{id}")
	public ResponseEntity<Student> getById(@PathVariable int id)
	{
		Student s1=service.getByID(id);
		
		return new ResponseEntity<Student>(s1, HttpStatus.OK);
	}
	
	@PutMapping("/student/update/{id}")
	public ResponseEntity<Student> updateById(@PathVariable int id,@RequestBody Student s)
	{
		Student s1=service.updateByID(id, s);
		return new ResponseEntity<Student>(s1, HttpStatus.OK);
	}
	
	
	public ResponseEntity<String> deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}

}
