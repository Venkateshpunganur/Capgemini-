package com.sprin.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprin/collections/beans.xml");
        emp emp1=context.getBean("emp1",emp.class);
        System.out.println(emp1.getAddress());
	}

}
