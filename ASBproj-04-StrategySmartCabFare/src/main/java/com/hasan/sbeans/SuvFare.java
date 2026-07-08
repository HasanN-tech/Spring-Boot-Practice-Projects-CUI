package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("suv")
public class SuvFare implements FareStrategy {
	
	private double night=80;
	
	@Value("${suv.perKm}")
	private double perKm;
	
	@Override
	public double calculateFare(int distance) {
		return night+(distance*perKm);
	}

	@Override
	public void showVehicleType() {
		IO.println("SUV vehicle");
	}

}
