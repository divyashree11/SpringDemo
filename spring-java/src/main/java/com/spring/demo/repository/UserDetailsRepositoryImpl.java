package com.spring.demo.repository;

import org.springframework.stereotype.Repository;

import com.spring.demo.model.User;

@Repository("UserDetailsRepository")
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

	public String createUSer(User user) {
		return ("user created "+user.getName()+" with role "+user.getRole());
	}

}
