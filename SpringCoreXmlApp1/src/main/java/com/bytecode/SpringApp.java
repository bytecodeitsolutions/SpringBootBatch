package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.Car;


public class SpringApp {

	public static void main(String[] args) {
		//sasu maa
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car c1=(Car) context.getBean("c1");
		c1.drive();
		
	}

}
