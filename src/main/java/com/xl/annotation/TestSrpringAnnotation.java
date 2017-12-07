package com.xl.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xl.xml.User;

@Configuration
@ComponentScan
public class TestSrpringAnnotation {

	@Autowired
	private static User user;
	
	public static void main(String[] args) {

			System.out.println(user.getAge());

	}

}
