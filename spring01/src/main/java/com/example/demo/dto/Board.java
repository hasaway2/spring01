package com.example.demo.dto;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
public class Board {
	private Long bno;
	private String title;
	private String writer;
	private LocalDate writeday;
	private Long readcnt;
}
