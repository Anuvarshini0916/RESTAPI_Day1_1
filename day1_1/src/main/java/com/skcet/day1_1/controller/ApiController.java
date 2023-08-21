package com.skcet.day1_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("display")
	public String Welcome() {
    	return "Welcome String Boot!";
    }
}
