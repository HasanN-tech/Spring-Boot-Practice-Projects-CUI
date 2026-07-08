package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Cash implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		IO.println("Paid amount "+amount+" using Cash");
	}

}
