package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@Profile("petrol")
@ConfigurationProperties(prefix = "engine")
public class Petrol implements Engine {
	
	private String power;
	private String mileage;
	private String company;

	@Override
	public void startEngine() {
		IO.println("Petrol Engine Started.");
	}

	@Override
	public void showEngineDetails() {
		IO.println("Engine Power: " + power);
		IO.println("Mileage: " + mileage);
		IO.println("Company Name: " + company);
	}

}
