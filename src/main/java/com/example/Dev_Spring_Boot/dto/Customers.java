package com.example.Dev_Spring_Boot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customers {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	int id;
	@Id
//	@Column(name = "customerNumber")
//	private int customerNumber;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "contactFirstName")
	private String contactFirstName;
	@Column(name = "contactLastName")
	private String contactLastName;
	@Column(name = "city")
	private int city;



}
