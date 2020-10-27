package com.demo.client.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.client.swagger.api.UsersApi;
import com.demo.client.swagger.model.User;

@RestController
public class UsersRestController implements UsersApi {

	@Override
	public ResponseEntity<List<User>> findAll() {
		List<User> users = new ArrayList<User>();
		users.add(new User());
		return ResponseEntity.ok(users);
	}

	@Override
	public ResponseEntity<User> save(User user) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(new User());
	}
	
	

}
