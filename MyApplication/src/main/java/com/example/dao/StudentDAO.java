package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{
	
	Student findByMailId(String mailId);
	
}
