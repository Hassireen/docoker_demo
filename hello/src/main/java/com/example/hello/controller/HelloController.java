package com.example.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	@RequestMapping("/name")
	public String name() {
		return "my name is hassireen";
	}
	@RequestMapping("/age")
	public int age() {
		return 22;
	}

}
