package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.dto.Student;
import com.example.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
   
	@Autowired
	IStudentService studentservice;
	
	@RequestMapping("/searchStudent")
	public String searchStudentpage() {
		return "search";
	}
	
	@GetMapping("/seachStudentByMailId")
	public String searchStudent(Model m,String mailId) {
		if(!studentservice.isValidMailId(mailId)) {
			m.addAttribute("exception", "Invalid Email Id");
			return "search";
		}
		Student s = studentservice.searchStudentInfo(mailId);
		if(s == null) {
			m.addAttribute("notExists", "The student with this email Id is not present");
			return "search";
		}
		m.addAttribute("student", s);
		return "showDetails";
	}
	
	@RequestMapping("/newStudent")
	public String newStudentForm() {
		return "studentForm";
	}
	
	@PostMapping("/studentInfo")
	public String newStudent(Model m,Student student) {
		if(!studentservice.isValidMailId(student.getMailId())) {
			m.addAttribute("exception", "Invalid Email Id");
			return "studentForm";
		}
		studentservice.addStudent(student);
		m.addAttribute("addedMessage", "Student Added Successfully");
		return "loginSuccess";
	}
}
