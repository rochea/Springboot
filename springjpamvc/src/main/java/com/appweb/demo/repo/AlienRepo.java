package com.appweb.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.appweb.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
	Alien findByTech(String tech);

	
	
	
	
}
