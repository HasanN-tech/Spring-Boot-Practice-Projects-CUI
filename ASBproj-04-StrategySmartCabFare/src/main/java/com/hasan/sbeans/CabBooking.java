package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;
@Service
@ImportResource("com/hasan/config/applicationContext.xml")
public class CabBooking {
	
	@Autowired
	@Qualifier("vehicle")
	private FareStrategy strategy;
	
	@Value("${total.distance}")
	private int distance;
	
	public void bookCab() {
		strategy.showVehicleType();
	}
	public void generateBill() {
		IO.println("Total Fare: "+strategy.calculateFare(distance));
	}
}
