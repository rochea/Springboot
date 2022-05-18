package com.appweb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appweb.demo.model.Alien;
import com.appweb.demo.repository.Repo;

@Controller

public class AController {
	
	@Autowired
	Repo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId) {
		
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = repo.findById(aId).orElse(null);
		
		
		System.out.println(repo.findByaName("roche"));
		System.out.println(repo.findByaMarks(99));
		
		mv.addObject("a1", alien);
		return mv;
	}
	
	@RequestMapping("/getAmarks")
	public ModelAndView getAmarks(@RequestParam int aMarks) {
		
		ModelAndView mb = new ModelAndView("getmarks.jsp");
		
		Alien alien = repo.findByaMarks(aMarks);
		
		System.out.println(repo.findByaMarks(aMarks));
		
		mb.addObject("a2",alien);
	
		return mb;
	}
	
//	@GetMapping("/getAmarks/{aMarks}")
//	public List<Alien> findByaMarks(@PathVariable int aMarks) {
//		return repo.findByaMarks(aMarks);
//	}
	
}
