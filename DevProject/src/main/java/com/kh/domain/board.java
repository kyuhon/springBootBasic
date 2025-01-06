package com.kh.domain;

import java.util.Date;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.NonNull;
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
public class board {
	private static final long serialVersionUID = 1L; 
	private int boardNo;
	@NonNull
	private String title; 
	@NonNull
	private String content; 
	private String writer; 
	private Date regDate; 
	 
	 
	public board(int boardNo, String title) 
	{ super(); 
	this.boardNo = boardNo; 
	this.title = title; 
	} 
	 
	// 클래스의 속성들은 get, set 혹은 표준 명명법을 따르는 메서드들을 사용해 접근할 수 있어야 한다. 
	public int getBoardNo() 
	{ return boardNo; 
	} 
	 
	public void setBoardNo(int boardNo) 
	{ this.boardNo = boardNo; 
	} 
	 
	public String getTitle() 
	{ return title; 
	} 
	 
	public void setTitle(String title) 
	{ this.title = title; 
	} 
	 
	public String getContent() 
	{ return content; 
	} 
	 
	public void setContent(String content) 
	{ this.content = content; 
	} 
	public String getWriter() 
	{ return writer; 
	} 
	 
	public void setWriter(String writer) 
	{ this.writer = writer; 
	} 
	 
	public Date getRegDate() 
	{ return regDate; 
	} 
	 
	public void setRegDate(Date regDate) 
	{ this.regDate = regDate; 
	} 
	 
	@Override 
	public int hashCode() { 
	final int prime = 31; 
	int result = 1; 
	result = prime * result + boardNo; 
	return result; 
	} 
	 
	@Override 
	public boolean equals(Object obj) 
	{ if (this == obj) 
	return true; 
	if (obj == null) 
	return false; 
	if (getClass() != obj.getClass()) 
	return false; 
	board other = (board) obj; 
	if (boardNo != other.boardNo) 
	return false; 
	return true; 
	} 
	 
	@Override 
	public String toString() { 
	return "Board(boardNo=" + boardNo + ", title=" + title + ", content=" + 
	content + ", writer=" + writer + ", regDate=" + regDate + ")"; 
	} 
	 
	} 

