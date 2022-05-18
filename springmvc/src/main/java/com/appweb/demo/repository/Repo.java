package com.appweb.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.appweb.demo.model.Alien;

public interface Repo extends CrudRepository<Alien, Integer>{
	
	List<Alien> findByaName(String aName);
	
	Alien findByaMarks(int aMarks);
	
//	List<Alien> findbyaNameSorted(String aName);
	
}
