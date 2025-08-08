package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {

public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		Phone p1=con.getBean("phone",Phone.class);
		
		p1.calling();
		p1.internet();
	}
}
