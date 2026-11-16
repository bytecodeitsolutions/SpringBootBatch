package com.bytecode.spring.beans;

import com.bytecode.spring.inter.Notification;

public class SMSNotificationServiceImpl implements Notification{

	@Override
	public String sendNotification() {
		
		return "Notification sent via SMS";
	}

}
