package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.DBConnection;

//main class jisme hum spring container create krenge
public class PropertyFileApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DBConnection connection = context.getBean("db", DBConnection.class);
		System.out.println(connection);
		((ConfigurableApplicationContext) context).close();

	}

}
