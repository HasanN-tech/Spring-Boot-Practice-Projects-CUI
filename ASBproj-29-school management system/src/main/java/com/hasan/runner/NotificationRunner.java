package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.School;

@Component
public class NotificationRunner implements CommandLineRunner{

	@Autowired
	private School sc;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(sc);
	}

}
