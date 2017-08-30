package com.gi.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gi.springboot.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	@Query(value="{company.name:?0}")
	User findbyCompanyName(String companyName);
}
