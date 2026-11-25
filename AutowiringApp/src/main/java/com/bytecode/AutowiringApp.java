package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bytecode.beans.Employee;

public class AutowiringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = context.getBean("emp", Employee.class);
		employee.getEmployeeData();
	    ((AbstractApplicationContext) context).close();
	}

}
