package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.NotificationService;

@Component
public class NotificationRunner implements CommandLineRunner{

	@Autowired
	private NotificationService notificationService;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(notificationService.sendNotification("Hii, How are you!"));
	}

}
