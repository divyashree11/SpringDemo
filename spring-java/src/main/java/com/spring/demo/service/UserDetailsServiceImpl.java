package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.User;
import com.spring.demo.repository.UserDetailsRepository;

@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDetailsRepository userRepo;
	
	public UserDetailsServiceImpl(){	
	}

	public UserDetailsServiceImpl(UserDetailsRepository userRepo){
		this.userRepo = userRepo;
	}
	
	public void setUserRepo(UserDetailsRepository userRepo) {
		this.userRepo = userRepo;
	}

	public String createUser(User user) {
				
		return userRepo.createUSer(user);
	}
}
