package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.Department;
import com.bytecode.beans.Employee;

public class AutowiringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = context.getBean("emp", Employee.class);
		employee.getEmployeeData();

		System.out.println("================");
		Department department = (Department) context.getBean("dept1");
		System.out.println(department.getDeptId() + "  " + department.getDeptName());

		 ((AbstractApplicationContext) context).close();
	}

}
