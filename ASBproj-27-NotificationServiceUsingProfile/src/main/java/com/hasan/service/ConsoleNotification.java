package com.hasan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ConsoleNotification implements NotificationService {

	@Override
	public String sendNotification(String msg) {
		IO.println(msg);
		return "Console Msg Sent.";
	}

}
