package com.example.Dev_Spring_Boot.services;

import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

	
	public String getMessage(String name) {
		// TODO Auto-generated method stub
		
		return "Welcome"+name+"!!!";
	}

}
