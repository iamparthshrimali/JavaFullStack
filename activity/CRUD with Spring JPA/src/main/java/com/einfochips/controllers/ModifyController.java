package com.einfochips.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.dao.StudentDao;
import com.einfochips.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
public class ModifyController {
    @Autowired
    StudentDao dao;
    
    @Autowired
    Student s;
	@RequestMapping("/modify-page")
	public ModelAndView modify_page(@RequestParam int id)
	{
		Optional<Student> os=dao.findById(id);
		 s=os.get();
		 
		return new ModelAndView("modify-page.jsp").addObject("student",s);
	}
	
	@RequestMapping("/modify")
	public ModelAndView modify(@RequestParam int id,@RequestParam String fname,@RequestParam String lname, @RequestParam String course)
	{
		ModelAndView mv=new ModelAndView("home.jsp");
		s.setId(id);
		s.setFname(fname);
		s.setLname(lname);
		s.setCourse(course);
		dao.save(s);
		
		List<Student> li=dao.findAll();
		return mv.addObject("students",li);
	}
	
	
}
