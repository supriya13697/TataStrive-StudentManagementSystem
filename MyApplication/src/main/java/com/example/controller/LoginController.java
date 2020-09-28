package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.dto.User;
import com.example.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService loginservice;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/userLogin")
	public String validateUser(Model m,User user) {
		
		boolean isValidUser = loginservice.validateUser(user);
        if (!isValidUser) {
            m.addAttribute("errorMessage", "Invalid Credentials");
            return "login";
        }
        m.addAttribute("uName", user.getuName());
        return "loginSuccess";
		
	}
}
