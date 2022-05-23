package com.appweb.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.appweb.demo.Model.Students;
import com.appweb.demo.Repo.StudRepo;


@Controller
public class StudController {
	
	@Autowired
	StudRepo srepo;
	
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	
	@RequestMapping ("/addStud")
	 public String addStud(Students student){
		srepo.save(student);
		return "home.jsp";
		
	}
	
	@RequestMapping("/viewStud")
	public String viewStud() {
		return"viewStud.jsp";
	}
	
//	@RequestMapping("/getstud")
//public Optional<Students> getstud(@PathVariable int sId ) {
//		
//		return srepo.findById(sId);
//	}
	
	
	@RequestMapping ("/getstudi")
	public ModelAndView getstudi(@RequestParam int sId) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Students students = srepo.findById(sId).orElse(new Students());
		mv.addObject("s1", students);
		return mv;
	}
	
	@RequestMapping ("/getstudn")
	public ModelAndView getstudn(@RequestParam String sName) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Students students = srepo.findBysName(sName);
		mv.addObject("s1", students);
		return mv;
	}
}
