package com.example.demo.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class Pagination {
	private Long prev;
	private Long start;
	private Long end;
	private Long next;
	private Long pageno;
}
