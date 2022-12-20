package com.trip.tripSchedual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "welcom beeeek";
	}; 
}
