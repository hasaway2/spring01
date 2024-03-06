package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

@Controller
public class SampleController1 {
	@GetMapping("/example1")
	public ModelAndView example1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1");
		return mav;
	}
	
	@GetMapping("/example2")
	public ModelAndView example2() {
		ModelAndView mav = new ModelAndView("sample1/example2");
		return mav;
	}
	
	@GetMapping("/example3")
	public ModelAndView example3() {
		ModelAndView mav = new ModelAndView("sample1/example3");
		mav.addObject("message", "안녕하세요");
		return mav;
	}
	
	@GetMapping("/example4")
	public ModelAndView example4(HttpServletRequest request) {
		String irum = request.getParameter("irum");
		ModelAndView mav = new ModelAndView("sample1/example3");
		mav.addObject("message", irum + "님 안녕하세요");
		return mav;
	}
}
