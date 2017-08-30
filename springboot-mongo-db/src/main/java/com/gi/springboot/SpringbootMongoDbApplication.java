package com.gi.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gi.springboot.model.Address;
import com.gi.springboot.model.Company;
import com.gi.springboot.model.User;
import com.gi.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootMongoDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDbApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		List<User> userList = new ArrayList<User>();
		for (int i = 1; i <= 10; i++) {
			User user = new User("user" + i, "username" + i, "user_email" + i + "@gmail.com", "2003004000" + i,
					new Address("street" + i, "apt" + i, "city" + i, "zipcode" + i),
					new Company("companyName" + i, "www.company" + i + ".com", "headquarters" + i));
			userList.add(user);
		}
		//UnComment the below for initial data setup, then comment this line for subsequent usages
		userRepository.save(userList);
	}
}
