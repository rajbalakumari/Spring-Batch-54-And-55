service 
package com.nit.SpringBoot_Student_Managment_System.service;

import java.util.List;

import com.nit.SpringBoot_Student_Managment_System.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student s);
	
	public List<Student>getAllStudent();
	
	public Student getByID(int id);
	
	public Student updateByID(int id,Student s);
	
	public String deleteStudent(int id);

}
