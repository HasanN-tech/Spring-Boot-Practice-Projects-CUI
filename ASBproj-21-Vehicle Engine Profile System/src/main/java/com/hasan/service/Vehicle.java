package com.hasan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Autowired
	private Engine engine;
	public void drive() {
		engine.startEngine();
		engine.showEngineDetails();
	}
}
