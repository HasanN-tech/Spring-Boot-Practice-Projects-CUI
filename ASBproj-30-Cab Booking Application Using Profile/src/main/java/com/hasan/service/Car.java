package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Profile("prod")
@ConfigurationProperties(prefix = "car")
public class Car implements CabService {

	private String name;
	private String location;
	private double price;
	@Override
	public void book() {
		IO.println("Car is booked.");
	}
	
	@Override
	public void details() {
		IO.println("Name: "+name);
		IO.println("Location: "+location);
		IO.println("Price: "+price);
	}

}
