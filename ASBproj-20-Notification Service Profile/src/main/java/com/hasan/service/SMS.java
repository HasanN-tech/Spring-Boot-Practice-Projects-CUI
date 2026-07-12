package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@Profile("sms")
@ConfigurationProperties(prefix = "sms")
public class SMS implements NotificationService {

	private String senderName;
	private String number;
	private String notificationType;
	
	@Override
	public void sendNotification() {
		IO.println("Notification: Hii, How are you?");
	}

	@Override
	public void displayNotificationInfo() {
		IO.println("Sender Name: "+senderName);
		IO.println("Support Email: "+number);
		IO.println("Notification Type: "+notificationType);
	}
}
