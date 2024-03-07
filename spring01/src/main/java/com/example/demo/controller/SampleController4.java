package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.dto.*;

@Controller
public class SampleController4 {
	private List<Board> getList() {
		List<Board> list = new ArrayList<>();
		for(Long i=10L; i>=1L; i--) {
			list.add(new Board(i, i+"번째 글", "spring", LocalDate.now(), i));
		}
		return list;
	}
	
	@GetMapping("/sample4/jstl1")
	public ModelAndView jstl1() {
		ModelAndView mav = new ModelAndView("sample4/jstl1");
		return mav.addObject("username", "spring").addObject("nai", 35);
	}
	
	@GetMapping("/sample4/jstl2")
	public ModelAndView jstl2() {
		ModelAndView mav = new ModelAndView("sample4/jstl2");
		return mav.addObject("list", getList());
	}
	
	@GetMapping("/sample4/jstl3")
	public ModelAndView jstl3() {
		ModelAndView mav = new ModelAndView("sample4/jstl3");
		Pagination p = new Pagination(0L, 1L, 5L, 6L, 2L);
		return mav.addObject("list", getList()).addObject("pagination", p);
	}
}
