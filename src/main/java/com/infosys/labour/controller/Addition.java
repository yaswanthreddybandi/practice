package com.infosys.labour.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
	
	@GetMapping("addi")
	public Integer addi(Integer a , Integer b) {
		int c = a+b;
		
		return c;
	}
	
	@GetMapping("multi/{a}/{b}")
	public Integer multi(@PathVariable Integer a , @PathVariable Integer b) {
		
		int c = a*b;
		return c;
	}
	@PostMapping("saveStud")
	public void saveDet(@RequestBody Student std) {
		
	System.out.println(std);
	}
	

}
