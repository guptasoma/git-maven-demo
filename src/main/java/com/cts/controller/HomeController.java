package com.cts.controller;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends SpringBootServletInitializer{

	@GetMapping("/")
	public String showHome() {
		System.out.println("method called");
		return "home";
	}
}
