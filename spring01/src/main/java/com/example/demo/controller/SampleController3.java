package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.dto.*;

// 객체를 스프링이 관리하고, 개발자가 필요한데 하면 객체를 준다
// !!!!!! 의존성 주입(Dependency Injection) !!!!!!

// 객체는 크게 두가지 종류
// 데이터를 저장하는 객체 : Entity - Board, Todo....
// 데이터를 처리하는 객체 : BoardController, BoardService....
//					  싱글톤이다 -> 스프링에 위임하자

// 능동적인 프로그래밍 : 개발자가 필요한 객체를 생성(new)해서 사용한다
// 수동적인 프로그래밍 : 설정에 따라 스프링이 객체를 생성, 관리하다가 DI한다

// 스프링이 생성해서 주입해주는 객체 : !!!!!! bean !!!!!!!
// 빈을 생성하는 어노테이션 : @Controller

@Controller
public class SampleController3 {
	
	@GetMapping("/sample3/el")
	public ModelAndView el() {
		String username = "spring";
		Pagination p = new Pagination(0L, 1L, 5L, 6L, 2L);
		
		ModelAndView mav = new ModelAndView("sample3/el");
		
		return mav.addObject("username", username)
				.addObject("pagination", p);
	}
}







