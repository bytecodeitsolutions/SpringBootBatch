package com.bytecode;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.DBConnection;
import com.bytecode.beans.Student;

//main class jisme hum spring container create krenge
public class PropertyFileApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DBConnection connection = context.getBean("db", DBConnection.class);
		System.out.println(connection);
		
		System.out.println("===========collection injection=============");
		Student s=context.getBean("s1",Student.class);
		List<String> x=s.getCourses();
		System.out.println(x);
		
		((ConfigurableApplicationContext) context).close();

	}

}
