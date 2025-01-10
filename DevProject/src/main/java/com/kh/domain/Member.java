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
public class Member {
	private String userId;
	private String password;
	private int coin;
	private Date dateOfBirth;
} 

