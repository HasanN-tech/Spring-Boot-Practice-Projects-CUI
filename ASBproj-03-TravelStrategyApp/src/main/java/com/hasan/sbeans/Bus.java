package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements TravelStrategy {

	@Override
	public void startJourney() {
		IO.println("Journey Started using Bus!");
	}

}
