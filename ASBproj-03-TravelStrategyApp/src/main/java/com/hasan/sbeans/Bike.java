package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements TravelStrategy {

	@Override
	public void startJourney() {
		IO.println("Journey Started using bike!");
	}

}
