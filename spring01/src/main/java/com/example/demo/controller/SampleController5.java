package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

@Controller
public class SampleController5 {
	@GetMapping("/sample5/index")
	public ModelAndView index() {
		return new ModelAndView("sample5/index");
	}
	
	@GetMapping("/sample5/login")
	public ModelAndView login() {
		return new ModelAndView("sample5/login");
	}
	
	@PostMapping("/sample5/login")
	public ModelAndView login(HttpServletRequest request, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("spring") && password.equals("1234")) {
			session.setAttribute("username", username);
			return new ModelAndView("redirect:/sample5/index");
		}
		return new ModelAndView("redirect:/sample5/login");
	}
	
	@PostMapping("/sample5/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/sample5/index");
	}
}
