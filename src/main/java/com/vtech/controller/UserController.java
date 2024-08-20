package com.vtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vtech.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	/*
	 * @PostMapping("/doLogin") public String doLogin(@RequestParam(name =
	 * "userName", defaultValue = "scott") String userName,
	 * 
	 * @RequestParam(name = "password") String password) { return
	 * userService.doLogin(userName, password); }
	 */

	/*
	 * @PostMapping("/doLogin") public String doLogin(@ModelAttribute UserDTO
	 * userDTO) { return userService.doLogin(userDTO.getUserName(),
	 * userDTO.getPassword()); }
	 */

	/*
	 * @PostMapping("/doLogin") public String doLogin(HttpServletRequest request) {
	 * 
	 * String userName = request.getParameter("userName"); String password =
	 * request.getParameter("password");
	 * 
	 * return userService.doLogin(userName, password);
	 * 
	 * }
	 */

	@PostMapping("/doLogin")
	public ModelAndView doLogin(HttpServletRequest request, ModelAndView modelAndView) {

		// ModelAndView modelAndView = new ModelAndView();

		HttpSession httpSession = request.getSession(true);

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		// modelAndView.addObject("userName", userName);
		httpSession.setAttribute("userName", userName);
		modelAndView.addObject("employee", userService.getEmployeeInformation());
		modelAndView.setViewName(userService.doLogin(userName, password));

		return modelAndView;

	}

	@GetMapping("/payment")
	public String payment() {
		return "payment";

	}
}