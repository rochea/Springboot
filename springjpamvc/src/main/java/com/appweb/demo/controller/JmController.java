package com.appweb.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
	
	@PostMapping("/addAlien")
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
	
	@RequestMapping("/getTech")
	public ModelAndView getTech(@RequestParam String tech){
		
		ModelAndView mb = new ModelAndView("/gettech.jsp");
		Alien alien = repo.findByTech(tech);
		mb.addObject("a1", alien);
		System.out.println(alien);
		return mb;
	}
	
	@GetMapping("/Alien")
	@ResponseBody
	public Iterable<Alien> getAlien() {
		
		return repo.findAll();
	}
	
	
	@GetMapping("/Alien/{tech}")
	@ResponseBody
	public Alien getAlien(@PathVariable String tech ) {
		
		return repo.findByTech(tech);
	}
	
	
//	@DeleteMapping("/Alien/{aId}")
//	public String deleteAlien(@PathVariable int aId) {
//		
//		Optional<Alien> a = repo.findById(aId);
//		repo.deleteById(a);
//		
//		return aId+ "deleted";
//	}
	
	@PutMapping("/addAlien")
	public Alien saveorupdateAlien(Alien alien){
		
		repo.save(alien);
		return alien;
	}
}
