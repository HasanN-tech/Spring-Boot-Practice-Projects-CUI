package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mini")
public class MiniFare implements FareStrategy {
	
	private double base=50;
	@Value("${mini.perKm}")
	private double perKm;
	
	@Override
	public double calculateFare(int distance) {
		return base+distance*perKm;
	}

	@Override
	public void showVehicleType() {
		IO.println("Mini Vehicle");
	}

}
