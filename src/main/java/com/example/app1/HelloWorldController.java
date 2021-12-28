package com.example.app1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	String home() {
		return "HelloWorld -controller ";
	}
	@RequestMapping("/welcome.jsp")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
