package com.example.Dev_Spring_Boot.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.validation.constraints.Positive;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dev_Spring_Boot.dto.Sample;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/learning")
public class OrdersControllers {
	@ApiOperation("Return OrderList")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/getOrdersList", produces = { "application/json" })
	public ResponseEntity<?> getcustomersList() {
		List<Map<String, Object>> listAnything = new ArrayList<Map<String, Object>>();
		Map<String, Object> m = new HashMap<String, Object>();
		Sample s = new Sample();
		s.setOrder_id(12);
		s.setCust_name("Almdar");
		m.put("order_id", s.getOrder_id());
		m.put("cust_name", s.getCust_name());
	
		listAnything.add(m);

		return ResponseEntity.ok(listAnything);
	}

	@ApiOperation("Return Name")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@PostMapping(value = "/getMyName")
	public String getMyName() {
		return "Kirti";
	}

}
