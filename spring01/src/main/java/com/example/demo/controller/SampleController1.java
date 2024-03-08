package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import jakarta.servlet.http.*;

// 서블릿에 해당하는 클래스가 스프링의 컨트롤러
//   extends HttpServlet을 해야 톰캣이 서블릿인걸 알아본다
// 스프링은 상속 대신 어노테이션을 사용한다

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
		ModelAndView mav = new ModelAndView("example2");
		return mav; 
	}
	
	@GetMapping("/example3")
	public ModelAndView example3() {
		ModelAndView mav = new ModelAndView("example3");
		mav.addObject("message", "안녕하세요").addObject("hello","안녕");
		return mav;
	}
	
	// 사용자가 입력한 값을 jsp로 출력하기
	// 스프링 컨트롤러 메소드의 인자를 적으면 스프링이 넣어준다
	// !!!!!!! 의존성 주입(Dependency Injection, DI) !!!!!!!!!!!!!
	@GetMapping("/example4")
	public ModelAndView example4(HttpServletRequest req) {
		String irum = req.getParameter("irum");
		ModelAndView mav = new ModelAndView("sample1/example4");
		mav.addObject("irum", irum);
		return mav;
	}
	
}






