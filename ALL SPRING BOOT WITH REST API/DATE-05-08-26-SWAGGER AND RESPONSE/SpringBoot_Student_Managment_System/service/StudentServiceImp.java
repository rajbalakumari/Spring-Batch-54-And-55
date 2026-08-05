package com.nit.SpringBoot_Student_Managment_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.SpringBoot_Student_Managment_System.entity.Student;
import com.nit.SpringBoot_Student_Managment_System.repository.StudentRepo;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student getByID(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Student updateByID(int id, Student s) {
		// TODO Auto-generated method stub
		
		Student s1=repo.findById(id).get();
		s1.setName(s.getName());
		s1.setCourse(s.getCourse());
	
		return repo.save(s1);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted";
	}

}
