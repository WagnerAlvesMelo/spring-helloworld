package com.project.helloWorld.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.helloWorld.interfaces.User;
import com.project.helloWorld.model.UserModel;
import com.project.helloWorld.service.UserService;

@RestController
@Validated
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	ResponseEntity<User> insertUser(@Valid @RequestBody UserModel body) {
		return ResponseEntity.ok(userService.addUser(body));
	}
	
	@GetMapping("/user")
	ResponseEntity<List<UserModel>> getUser() {
		return ResponseEntity.ok(userService.getUsers());
	}
}
