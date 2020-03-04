package com.example.Dev_Spring_Boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dev_Spring_Boot.dto.countries;
import com.example.Dev_Spring_Boot.repository.CrudeOperation;
import com.example.Dev_Spring_Boot.services.CommonService;
import com.example.Dev_Spring_Boot.services.CommonServiceImpl;



@RestController
public class MessageController {
	@Autowired
	private CommonServiceImpl commonserviceimpl;
	@RequestMapping("/api/getCountrieslist")
	public String  getCountrieslist(){
		return commonserviceimpl.getMessage("Jayprakash Patel");
	}

}
