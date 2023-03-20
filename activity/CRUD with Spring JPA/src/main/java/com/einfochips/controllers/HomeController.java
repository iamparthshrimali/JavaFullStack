package com.einfochips.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.dao.StudentDao;
import com.einfochips.models.Student;

@RestController
public class HomeController {
	 @Autowired
	  StudentDao dao;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		
		ModelAndView mv=new ModelAndView("home.jsp");
		List<Student> li=dao.findAll();
		return mv.addObject("students",li);
	}
	@RequestMapping("/course")
	public ModelAndView course(@RequestParam String course)
	{
		ModelAndView mv=new ModelAndView("home.jsp");
		if(course.equals("all"))
		{	
			return home();
		}
		List<Student> li=dao.findByCourse( course);
		mv.addObject("students",li);
		mv.addObject("settedCourse",course);
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id)
	{
		dao.deleteById(id);
		return home();
	}
	
	@RequestMapping("/add")
	public ModelAndView add()
	{
		return new ModelAndView("add.jsp");
	}

}
