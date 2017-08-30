package com.gi.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gi.springboot.model.User;
import com.gi.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	UserService userService;

	@GetMapping("/getAll")
	public List<User> getAllUserDetails() {
		return userService.getAllUserDetails();
	}
	
	@GetMapping("/get/{companyName}")
	public User findbyCompanyName(@PathVariable String companyName){
		return userService.findbyCompanyName(companyName);
	}

	@PostMapping(path = "/insert", consumes = "application/json")
	public void insertUser(@RequestBody User user) {
		userService.insertUser(user);
	}
	
	@PutMapping(path = "/update", consumes = "application/json")
	public void updateUser(@RequestBody User user){
		userService.updateUser(user);
	}
}
