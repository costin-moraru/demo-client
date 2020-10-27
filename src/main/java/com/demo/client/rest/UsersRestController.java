package com.demo.client.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersRestController {
	
	@GetMapping("/")
	public String findAll() {
		return "Hello world";
	}
	
	@GetMapping("/{userId}")
	public String findUserById() {
		return "Hello world";
	}

}
