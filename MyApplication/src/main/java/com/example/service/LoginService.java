package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.User;

@Service
public class LoginService implements ILoginService{

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		return user.getuName().equalsIgnoreCase("Supriya")
                && user.getPassword().equalsIgnoreCase("12345");
	}

}
