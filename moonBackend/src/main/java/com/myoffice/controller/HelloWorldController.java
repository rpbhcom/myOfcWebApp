package com.myoffice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hw")
@CrossOrigin()
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

}