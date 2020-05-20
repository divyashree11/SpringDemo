package com.spring.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.demo.repository.UserDetailsRepositoryImpl;
import com.spring.demo.service.UserDetailsServiceImpl;

@Configuration
//@ComponentScan("com.spring.demo")
public class AppConfig {
	
	  //create repo bean
	  @Bean("userRepo") 
	  public UserDetailsRepositoryImpl getUserDetailsRepository(){ 
		  return new UserDetailsRepositoryImpl(); 
	  }
	  
	  //create service bean
	  @Bean("UserDetailsService") 
	  public UserDetailsServiceImpl getUserDetailsService() {
	  
	  // setter injection start
	  //UserDetailsServiceImpl serviceImpl = new UserDetailsServiceImpl();
	  //serviceImpl.setUserRepo(getUserDetailsRepository()); 
	  //setter injection end
	  
	  //constructor injection
	  UserDetailsServiceImpl serviceImpl2 = new UserDetailsServiceImpl(getUserDetailsRepository());
	  return serviceImpl2; 
	  }
	 
}
