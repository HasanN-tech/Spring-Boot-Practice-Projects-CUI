package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	@Autowired
	@Qualifier("notification")
	NotificationStrategy ns;
	
	public void notifyUser(String msg) {
		ns.sendMessage(msg);
	}
}
