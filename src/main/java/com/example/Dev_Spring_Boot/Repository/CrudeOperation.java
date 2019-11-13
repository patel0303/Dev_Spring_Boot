package com.example.Dev_Spring_Boot.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Dev_Spring_Boot.Models.countries;

@Repository
public interface CrudeOperation extends CrudRepository<countries, Long>{

}
