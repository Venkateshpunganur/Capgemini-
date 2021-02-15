package sprin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("loaded");
        Address ob2 = context.getBean("add1",Address.class);
        Customer object =context.getBean("cus1",Customer.class);
        
      System.out.println(ob2);
      System.out.println(object);
	}

}
