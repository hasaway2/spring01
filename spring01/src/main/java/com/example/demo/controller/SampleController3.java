package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

@Controller
public class SampleController3 {
	@GetMapping("/sample3/index")
	public ModelAndView index() {
		return new ModelAndView("sample3/index");
	}
	
	@GetMapping("/sample3/login")
	public ModelAndView login() {
		return new ModelAndView("sample3/login");
	}
	
	@PostMapping("/sample3/login")
	public ModelAndView login(HttpServletRequest request, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("spring") && password.equals("1234")) {
			session.setAttribute("username", username);
			return new ModelAndView("redirect:/sample3/success");
		}
		return new ModelAndView("redirect:/sample3/login");
	}
	
	@PostMapping("/sample3/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/sample3/index");
	}
	
	@GetMapping("/sample3/success")
	public ModelAndView success(HttpSession session) {
		if(session.getAttribute("username")==null)
			return new ModelAndView("redirect:/sample3/login");
		return new ModelAndView("sample3/success");
	}
}
