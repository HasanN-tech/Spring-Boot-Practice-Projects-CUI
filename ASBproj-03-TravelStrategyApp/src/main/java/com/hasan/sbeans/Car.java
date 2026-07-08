package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements TravelStrategy {

	@Override
	public void startJourney() {
		IO.println("Journey Started using Car!");
	}

}
