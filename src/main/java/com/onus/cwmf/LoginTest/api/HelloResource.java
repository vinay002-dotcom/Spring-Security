package com.onus.cwmf.LoginTest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cwmf")
public class HelloResource {

	 @GetMapping("/hello")
	public String getData() {
		return "Welcome to Onus";
	}
	
	
}
