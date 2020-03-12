package com.example.Dev_Spring_Boot.controllers;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dev_Spring_Boot.repository.CrudeOperation;
import com.example.Dev_Spring_Boot.services.CustomerServiceImpl;

@RestController
public class CustomerControllers {
	@Autowired
	private CustomerServiceImpl commonserviceimpl;

	@Autowired
	private CrudeOperation crudeOperation;

	
}
