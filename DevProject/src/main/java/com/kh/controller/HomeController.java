package com.kh.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
	
	@GetMapping(value = "/ajaxHome") 
	public String ajaxHome() { 
	log.info("headers 속성 매핑"); 
	return "ajaxHome"; 
	} 
	
	@GetMapping(value = "/formHome") 
	public String formHome() { 
	log.info("GET 방식 formHome"); 
	return "formHome"; 
	} 

}
