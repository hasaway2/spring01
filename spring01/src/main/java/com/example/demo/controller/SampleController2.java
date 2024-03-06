package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

@Controller
public class SampleController2 {
	@GetMapping("/sample2/add")
	public ModelAndView sumExample() {
		return new ModelAndView("sample2/add");
	}
	
	@PostMapping("/sample2/add")
	public ModelAndView sumExample(HttpServletRequest req) {
		Long val1 = Long.parseLong(req.getParameter("val1"));
		Long val2 = Long.parseLong(req.getParameter("val2"));
		Long result = val1 + val2;
		ModelAndView mav = new ModelAndView("sample2/result");
		mav.addObject("result", result);
		return mav;
	}
}
