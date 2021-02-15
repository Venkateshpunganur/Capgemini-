package com.practice1.selenium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	    ApplicationContext context = new AnnotationConfigApplicationContext(configclass.class);
		System.out.println("bean file loaded");
		Student stud = context.getBean("stud",Student.class);
		System.out.println(stud);
		
		
		
	}
	
}
