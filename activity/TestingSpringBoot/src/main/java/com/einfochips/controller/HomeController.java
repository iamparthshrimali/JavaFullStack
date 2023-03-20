package com.einfochips.controller;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.test.web.servlet.MockMvc;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "Hello home page";
	}

}
