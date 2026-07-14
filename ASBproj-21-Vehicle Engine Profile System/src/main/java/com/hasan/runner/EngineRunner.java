package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.Vehicle;

@Component
public class EngineRunner implements CommandLineRunner{
	@Autowired
	private Vehicle vehicle;
	
	@Override
	public void run(String... args) throws Exception {
		vehicle.drive();
	}
}
