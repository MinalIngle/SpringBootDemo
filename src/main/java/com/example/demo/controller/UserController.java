package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	// inject userService method here

	@Autowired
	public UserService userService;

	// Create the object of Logger and call the methods

	// pass your class name
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/name/{name}")
	public ResponseEntity<List<User>> getListByName(@PathVariable("name") String name) {
		// writes>>
		logger.info("In login service method");
		List<User> list = userService.getListByName(name);
		return ResponseEntity.ok().body(list);
	}
}
