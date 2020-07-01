package com.onlinelearning.web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlinelearning.web.mvc.model.User;
import com.onlinelearning.web.mvc.repository.UserRepository;
import com.onlinelearning.web.mvc.service.UserService;


@Controller
@RequestMapping(path = "/web/users")
@CrossOrigin(origins = "*")
public class UserController {
	
	
	private final UserService userService;
    
	@Autowired
	public UserController(UserService service) {
		this.userService = service;
	}

	@GetMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
		
	}
	
	@PutMapping(path = "/users")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.update(user));
	}
	
	@GetMapping(path = "/users/message")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping(path = "/users/{userId}")
	public ResponseEntity<User> findById(@PathVariable("userId") Long id) {
	   User u = userService.findOne(id);
		return ResponseEntity.status(HttpStatus.OK).body(u);
		
	}
	

	@GetMapping(path = "/users")
	public ResponseEntity<List<User>> findAll() {
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
		
	}
	

}
