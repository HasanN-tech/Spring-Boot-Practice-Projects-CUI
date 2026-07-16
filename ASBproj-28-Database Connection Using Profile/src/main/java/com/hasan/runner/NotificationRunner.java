package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.Databases;

@Component
public class NotificationRunner implements CommandLineRunner{

	@Autowired
	private Databases db;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(db.chooseDatabase("Database: "));
	}

}
