package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.dto.*;

// Tag Library : 별로 중요하지 않다.
//				 jsp에서 자바함수를 태그 비슷하게 사용할 수 있게 하는 기술
//				 <c:if>, <c:forEach>

// 다만 Java Standard Tag Library(JSTL)만 사용하고 있다

// 스프링부트는 JSTL을 지원하지 않는다 -> pom.xml 설정 필요
//    스프링부트 2, 스프링부트 3이 다르다

@Controller
public class SampleController4 {
	// private : 컨트롤러 내부에서 사용할 메소드
	private List<Board> getList() {
		List<Board> list = new ArrayList<>();
		for(Long i= 10L; i>0L; i--) {
			list.add(new Board(i, i+"번째 글", "spring", 
					LocalDate.now(), 10L));
		}
		return list;
	}
	
	// if, choose문 연습
	@GetMapping("/sample4/jstl1")
	public ModelAndView jstl1() {
		ModelAndView mav = new ModelAndView("sample4/jstl1");
		return mav.addObject("username", "spring");
	}
	
	// forEach문 연습
	@GetMapping("/sample4/jstl2")
	public ModelAndView jstl2() {
		ModelAndView mav = new ModelAndView("sample4/jstl2");
		return mav.addObject("list", getList());
	}
	
	
	@GetMapping("/sample4/jstl3")
	public ModelAndView jstl3() {
		Pagination p = new Pagination(0L, 1L, 5L, 6L, 2L);
		ModelAndView mav = new ModelAndView("sample4/jstl3");
		return mav.addObject("list", getList())
				.addObject("pagination", p);
	}
	
	@GetMapping("/sample4/jstl4")
	public ModelAndView jstl4(@RequestParam(defaultValue="1") Long pageno) {
		// /sample4/jstl3?pageno=11		pageno:11
		// /sample4/jstl3
		System.out.println(pageno);
		return null;
	}

}













