package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bytecode.beans.Employee;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=context.getBean("employee",Employee.class);
		employee.getEMpData();
	
	}
}
