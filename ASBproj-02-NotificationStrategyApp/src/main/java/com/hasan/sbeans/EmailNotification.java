package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationStrategy {

	@Override
	public void sendMessage(String msg) {
		IO.println("Email Notification sent: "+msg);
	}

}
