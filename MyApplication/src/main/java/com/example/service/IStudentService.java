package com.example.service;

import com.example.dto.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);
	public Student searchStudentInfo(String mailId);
	public boolean isValidMailId(String mailId);
	
}
