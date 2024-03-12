package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

	@GetMapping()
	public String displayMsg() {
		return "Your Spring Boot Applicatin is Running";
	}
	
	
	@GetMapping("say")
	public String sayHello() {
	  return "Hello Spring Boot Jenking Application";
	}
	
}
