package com.demo.client.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "from Spring Boot App");
		return "home";
	}
	
	@GetMapping("/dettagli")
	public String dettagli(Model model) {
		model.addAttribute("name", "from Spring Boot App");
		return "dettagli";
	}

}
