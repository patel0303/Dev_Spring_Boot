package com.example.Dev_Spring_Boot.WebController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping("/")
	public String HelloWorld(){
		return "Welcome to Spring Boot Api Learing";
	}

}
