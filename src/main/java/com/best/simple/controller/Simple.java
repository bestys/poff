package com.best.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello , spring boot!";
	}
}
