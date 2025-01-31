package com.kh.domain;

import java.util.Date;

import lombok.Builder;
//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode(of="boardNo")
//@AllArgsConstructor
@Data
@Builder
public class Board {
	public Board() {
	}
	
	public Board(int boardNo, String title, String content, String writer, Date regDate) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	private int boardNo;
	private String title; 
	private String content; 
	private String writer; 
	private Date regDate;
} 

