package com.product.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	
	
	
	@GetMapping("/")
	
	public String home() {
		
		return "hello baby come back in 48 hours ;)";
	}
	
}
