package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.Test1;

public class AnnotationXMLApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Test1 test1 = context.getBean("test1", Test1.class);
		test1.m1();
	}

}
