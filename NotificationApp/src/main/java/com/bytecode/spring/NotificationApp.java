package com.bytecode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.service.NotificationService;

public class NotificationApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		NotificationService notificationService = applicationContext.getBean("ns", NotificationService.class);
		System.out.println(notificationService.sendMsg());
		((AbstractApplicationContext) applicationContext).close();
	}

}
