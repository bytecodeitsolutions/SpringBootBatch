package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Student student = applicationContext.getBean("student", Student.class);
		student.study();
		((AbstractApplicationContext) applicationContext).close();
	}

}
