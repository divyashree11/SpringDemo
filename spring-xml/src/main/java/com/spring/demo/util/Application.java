package com.spring.demo.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.model.User;
import com.spring.demo.service.UserDetailsService;

public class Application {

	public static void main(String[] args) {
		
		//tell application context to fetch bean details fromspringApplicationContext.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
		
		User u1 = new User();
		u1.setName("Peter");
		u1.setRole("Student");
		
		//get bean from context along with all its dependencies
		UserDetailsService service = appContext.getBean("userService",UserDetailsService.class);
		
		System.out.println(service.createUser(u1));
	}
}
