package com.appweb.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.appweb.demo.model.Alien;
import com.appweb.demo.repository.Repo;

@RestController

public class AController {
	
	@Autowired
	Repo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		
//		return "home.jsp";
//	}
	
	@PostMapping("/Alien")
	public Alien addAlien(Alien alien) {
		repo.save(alien);
		
		return alien;
	}
	
	
	@GetMapping(path = "/Alien")  //// produces = {"application/xml, application/json"}) ////returns values in jason format without any user input. jason coversion is done by jackson
	@ResponseBody
	public List<Alien> getAliens() {	//// returns all the values in Alien table
	
		return repo.findAll();
		
	}
	
	
	
	@RequestMapping("/Alien/{aId}")     ///////// gets value  based on id given in http link
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable int aId) {   /*pathvariable is used to mention that this id is mentioned in
																 the http request*/
		return repo.findById(aId);
	}
	

	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId) {
		
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = repo.findById(aId).orElse(null);
		
//		System.out.println(repo.findByaName("roche"));
//		System.out.println(repo.findByaMarks(99));
//		System.out.println(repo.findbyaNameSorted("Ganesh"));
		
		mv.addObject("a1", alien);
		return mv;
	}
	
//	@RequestMapping("/getAmarks")
//	public ModelAndView getAmarks(@RequestParam int aMarks) {
//		
//		ModelAndView mb = new ModelAndView("getmarks.jsp");
//		
//		Alien alien = repo.findByaMarks(aMarks);
//		
//		System.out.println(repo.findByaMarks(aMarks));
//		
//		mb.addObject("a2",alien);  
//	
//		return mb;
//	}
	
//	@GetMapping("/getAmarks/{aMarks}")
//	public List<Alien> findByaMarks(@PathVariable int aMarks) {
//		return repo.findByaMarks(aMarks);
//	}
	
}
