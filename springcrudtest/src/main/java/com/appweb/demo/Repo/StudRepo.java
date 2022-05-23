package com.appweb.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.appweb.demo.Model.Students;

public interface StudRepo extends CrudRepository<Students, Integer> {
	
	Students findBysName (String sName);
}
