package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
		
	}

}
