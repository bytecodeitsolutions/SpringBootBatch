package com.bytecode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.main.beans.Student;

public class PropertyMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student obj = context.getBean("s1", Student.class);
		obj.displayStudentData();
		((AbstractApplicationContext) context).close();//task
	}

}
