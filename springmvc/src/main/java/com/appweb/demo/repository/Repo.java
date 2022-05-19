package com.appweb.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.appweb.demo.model.Alien;

public interface Repo extends JpaRepository<Alien, Integer>{   /// curdRepository only return iterables not list.
																/// japRepository extends curd and pagingandsorting repo 
	
//	List<Alien> findByaName(String aName);
//	
//	Alien findByaMarks(int aMarks);
//	
//    @Query("from Alien where aName =?1 order by aMarks")
//	List<Alien> findbyaNameSorted(String aName);
	
}
