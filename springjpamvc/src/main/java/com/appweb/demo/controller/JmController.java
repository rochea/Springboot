package com.appweb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appweb.demo.model.Alien;
import com.appweb.demo.repo.AlienRepo;

@Controller
public class JmController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien){
		
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId){
		
		ModelAndView mv = new ModelAndView("getalien.jsp");
		Alien alien = repo.findById(aId).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}

}
