package com.bytecode.spring.service;

import com.bytecode.spring.inter.Notification;

public class NotificationService {

	private Notification notification;

//	public NotificationService(Notification notification) {
//		this.notification = notification;
//	}

	public String sendMsg() {
		return notification.sendNotification();
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}
}
