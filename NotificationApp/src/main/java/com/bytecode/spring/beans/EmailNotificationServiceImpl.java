package com.bytecode.spring.beans;

import com.bytecode.spring.inter.Notification;

public class EmailNotificationServiceImpl implements Notification {

	@Override
	public String sendNotification() {

		return "Notification sent using Email";
	}

}
