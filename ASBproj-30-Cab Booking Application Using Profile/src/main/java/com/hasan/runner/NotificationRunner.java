package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.CabService;

@Component
public class NotificationRunner implements CommandLineRunner{

	@Autowired
	private CabService sc;
	
	@Override
	public void run(String... args) throws Exception {
		sc.book();
		sc.details();
	}

}
