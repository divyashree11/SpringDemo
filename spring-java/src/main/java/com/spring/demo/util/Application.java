package com.spring.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.model.User;
import com.spring.demo.service.UserDetailsService;

public class Application {

	public static void main(String[] args) {
		
		//tell application context to fetch bean details from App-config class
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User u1 = new User();
		u1.setName("Peter");
		u1.setRole("Student");
		
		//get bean from context along with all its dependencies
		UserDetailsService service = appContext.getBean("UserDetailsService",UserDetailsService.class);
		
		System.out.println(service.createUser(u1));
	}
}
