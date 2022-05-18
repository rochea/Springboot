package com.appweb.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.appweb.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
}
