package com.example.Dev_Spring_Boot.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import com.example.Dev_Spring_Boot.dto.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Override
	public List<Customers> getCustomersList() {
		 /// hello
		return null;
	}

}
