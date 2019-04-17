package com.capgemini.springhibernatedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springhibernatedemo.entity.Person;

@RestController
public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World...!!";
	}
	
	@RequestMapping("/person")
	public Person display() {
		Person person=new Person(101,"Abbas");
		return person;
	}
}
