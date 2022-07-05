package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

	@GetMapping("/")
	public String showHome() {
		System.out.println("method called");
		return "home";
	}
}
