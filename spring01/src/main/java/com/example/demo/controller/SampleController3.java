package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.dto.*;

@Controller
public class SampleController3 {
	@GetMapping("/sample3/el")
	public ModelAndView el() {
		ModelAndView mav = new ModelAndView("sample3/el");
		Pagination p = new Pagination(0L, 1L, 5L, 6L, 2L);
		return mav.addObject("username", "spring").addObject("pagination", p);
	}
}
