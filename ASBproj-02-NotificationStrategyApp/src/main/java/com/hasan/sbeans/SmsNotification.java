package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements NotificationStrategy {

	@Override
	public void sendMessage(String msg) {
		IO.println("SMS Notification sent: "+msg);
	}

}
