package com.pawantechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallbackMethod() {
		return "User-Service is taking longer than expected " + "Please try later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallbackMethod() {
		return "Department-Service is taking longer than expected " + "Please try later";
	}

}
