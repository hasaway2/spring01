package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

// 상품을 읽는다			/product/read
// 고객정보를 읽는다			/customer/read
// 주문정보를 읽는다			/order/read


@Controller
public class SampleController2 {
	// 화면을 보여준다
	@GetMapping("/sample2/add")
	public ModelAndView add() {
		return new ModelAndView("sample2/add");
	}
	
	// 두개의 값을 받아서 출력
	@PostMapping("/sample2/add")
	public ModelAndView add(HttpServletRequest req) {
		Long a = Long.parseLong(req.getParameter("val1"));
		Long b = Long.parseLong(req.getParameter("val2"));
		Long result = a + b;
		ModelAndView mav = new ModelAndView("sample2/result");
		return mav.addObject("result", result);
	}
}



