package com.vtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/home")
	public void homePage() {
		System.out.println("Student Controller is ready to handle the request...!");
	}

	@GetMapping("/getName")
	public void getName(@RequestParam String firstName, @RequestParam String lastName) {
		System.out.println("Welcome To :" + firstName + " " + lastName);
	}

	@GetMapping("/")
	public void indexPage() {
		System.out.println("Index Page is responding..!");
	}

	@GetMapping("/hello")
	@ResponseBody
	public String getMessage() {
		return "Hello";
	}

	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMessage(@RequestParam String firstName, @RequestParam String lastName) {
		return "<html><center><b><h1><font color='red'>Welcome To :" + firstName + " " + lastName
				+ "</font></h1></b></center></html";
	}

	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("message", "Welcome To JSP");
		return "greeting";
	}

	@GetMapping("/greeting2")
	public ModelAndView greeting2(ModelAndView modelAndView) {
		modelAndView.addObject("message", "Welcome To JSP with ModelAndView");
		modelAndView.setViewName("greeting2");
		return modelAndView;
	}

}