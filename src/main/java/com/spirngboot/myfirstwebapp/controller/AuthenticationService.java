package com.spirngboot.myfirstwebapp.controller;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isvalidUsername=username.equalsIgnoreCase("abc");
		boolean isvalidPassword=password.equalsIgnoreCase("abc");
		
		return isvalidPassword&&isvalidUsername;
	}
}
