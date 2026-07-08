package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sedan")
public class SedanFare implements FareStrategy {
	
	private double luxury=100;
	@Value("${sedan.perKm}")
	private double perKm;
	
	@Override
	public double calculateFare(int distance) {
		return luxury+distance*perKm;
	}

	@Override
	public void showVehicleType() {
		IO.println("Luxery Vehicle");
	}

}
