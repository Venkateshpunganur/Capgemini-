package com.collections.cap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collections/cap/beans.xml");
		Question coll1 = (Question)context.getBean("coll1");
		System.out.println(coll1.toString());
	}

}
