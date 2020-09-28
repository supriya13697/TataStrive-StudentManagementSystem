package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.dto.Student;

@Service
public class StudentService implements IStudentService{

	@Autowired
	StudentDAO dao;
	
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student s = dao.save(student);
		if(s == null)
			return null;
		return s;
	}

	@Override
	public Student searchStudentInfo(String mailId) {
		// TODO Auto-generated method stub
			return dao.findByMailId(mailId);
	}

	@Override
	public boolean isValidMailId(String mailId) {
		// TODO Auto-generated method stub
		String s = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return mailId.matches(s);
	}

}
