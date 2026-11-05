package com.bytecode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.Customer;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       // Customer customer=context.getBean("c1",Customer.class);
       // System.out.println(customer.getCustomerName());
		Customer c1=context.getBean("c1",Customer.class);
		String name=c1.getCustomerName();
		System.out.println(name);
		//c1.start();
		//c1.stop();
		((AbstractApplicationContext) context).close();
	}

}
