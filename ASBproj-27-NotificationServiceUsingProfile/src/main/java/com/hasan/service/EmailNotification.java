package com.hasan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class EmailNotification implements NotificationService {

	@Override
	public String sendNotification(String msg) {
		IO.println(msg);
		return "Email sent";
	}

}
