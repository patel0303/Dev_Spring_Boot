package com.example.Dev_Spring_Boot.WebController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dev_Spring_Boot.Models.countries;
import com.example.Dev_Spring_Boot.Repository.CrudeOperation;


@RestController
public class WebController {
	@Autowired
	CrudeOperation crudeOperation;
	@GetMapping("/api/getCountrieslist")
	public List<countries> getCountrieslist(){
		return (List<countries>) crudeOperation.findAll();
	}

}
