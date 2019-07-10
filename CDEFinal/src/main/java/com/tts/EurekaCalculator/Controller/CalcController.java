package com.tts.EurekaCalculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	
	@GetMapping("/add")
	public String newSum() {
		return "this is a test";
	}
	
	@GetMapping("/add/{x}+{y}")
	public String addSum(@PathVariable("x") int x, @PathVariable("y") int y) {
		int sum = x + y;
		return "The output is " + sum;
	}
	

}
