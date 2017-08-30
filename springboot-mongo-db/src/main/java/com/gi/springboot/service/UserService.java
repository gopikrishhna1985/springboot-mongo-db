package com.gi.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.springboot.model.User;
import com.gi.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public User findbyCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return userRepository.findbyCompanyName(companyName);
	}

}
