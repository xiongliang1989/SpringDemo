package com.xl.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("resources/xml/spring-application.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user.getAge());
	}

}
