package com.kh.controller;

import java.lang.reflect.Member;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.domain.Board;

import lombok.extern.java.Log;

@Log
@Controller
public class HomeController {
	
	//멤버변수
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("sysout 출력" + locale);
		log.info("log 출력" + locale);
		//locale, model 객체주입된것을 활용해서 출력
		Date date = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formatedDate = df.format(date);
		model.addAttribute("작업시간", formatedDate);
		logger.info("logger" + model.toString());
		System.out.println("sysout"+model);
		return "home";	//WEB-INF/views/home.jsp
	}
	
	
	@GetMapping(value = "/gohome10") 
	public @ResponseBody Map<String, Member> home10() { 
	log.info("컬렉션 Map 타입 home08"); 
	Map<String, Member> map = new HashMap<String, Member>(); 
	 
	Board board = new Board();

    board.setTitle("제목");
    board.setContent("내용입니다.");
    board.setWriter("홍길동");
    board.setRegDate(new Date());

    
    Board board2 = new Board();

    board2.setTitle("제목2");
    board2.setContent("내용입니다.2");
    board2.setWriter("홍길동2");
    board2.setRegDate(new Date());
	 
	return map; 
	} 
	
	@RequestMapping(value="/memberInsert", method = RequestMethod.GET)
	public String memberInsert() {
		return "memberInsert";
	}
	
	@RequestMapping(value="/ajaxhome6", method = RequestMethod.GET)
	public String ajaxhome6() {
		return "ajaxHome6";
	}
	
	
}
