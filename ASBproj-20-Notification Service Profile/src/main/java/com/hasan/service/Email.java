package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@Profile("email")
@ConfigurationProperties(prefix = "email")
public class Email implements NotificationService {
	
	private String senderName;
	private String supportEmail;
	private String notificationType;
	
	@Override
	public void sendNotification() {
		IO.println("Notification: Hii, How are you?");
	}

	@Override
	public void displayNotificationInfo() {
		IO.println("Sender Name: "+senderName);
		IO.println("Support Email: "+supportEmail);
		IO.println("Notification Type: "+notificationType);
	}
}
