package com.kh.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.domain.Board;
import com.kh.domain.Member;

import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

	@PostMapping(value = "/insert")
	public String insertMember(Member member, @DateTimeFormat(pattern = "yyyy/MM/dd") Date dateofBirth) {
		log.info("insertMember"); 
		log.info("member.getUserId() = " + member.getUserId()); 
		log.info("member.getPassword() = " + member.getPassword()); 
		log.info("member.getCoin() = " + member.getCoin()); 
		log.info("member.getDateOfBirth() = " + member.getDateOfBirth().toString()); 
		return "home";
	}
}
