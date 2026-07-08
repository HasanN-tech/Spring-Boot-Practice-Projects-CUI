package com.hasan.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Card implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		IO.println("Paid amount "+amount+" using Card");
	}
	
}
