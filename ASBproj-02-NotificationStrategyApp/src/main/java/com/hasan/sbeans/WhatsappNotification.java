package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("whatsapp")
public class WhatsappNotification implements NotificationStrategy {

	@Override
	public void sendMessage(String msg) {
		IO.println("Whatsapp Notification sent: "+msg);
	}

}
