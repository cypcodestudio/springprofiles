package com.cypcode.springprofiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Value("${sp.environment}")
	String environment;

	@GetMapping
	public String home() {
	 return "Welcome to Spring Profile: " + environment + " environment";
	}
}
