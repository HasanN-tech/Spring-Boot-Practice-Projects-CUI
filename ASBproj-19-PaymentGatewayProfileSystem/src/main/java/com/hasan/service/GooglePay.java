package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@Profile("gpay")
@ConfigurationProperties(prefix = "gpay")
public class GooglePay implements PaymentService {

	private String company;
	private double limit;
	private String type;
	@Override
	public void makePayment() {
		IO.println("Making Payment by: "+company);
	}

	@Override
	public void showDetails() {
		IO.println("Company Name: "+company);
		IO.println("Transaction Limit: "+limit);
		IO.println("Payment Type: "+type);
	}
}
