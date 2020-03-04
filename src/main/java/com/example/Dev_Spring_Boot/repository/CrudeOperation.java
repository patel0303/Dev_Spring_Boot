package com.example.Dev_Spring_Boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Dev_Spring_Boot.dto.countries;

@Repository
public interface CrudeOperation extends CrudRepository<countries, Long>{

}
