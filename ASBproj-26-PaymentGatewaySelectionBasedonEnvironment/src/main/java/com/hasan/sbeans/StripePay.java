package com.hasan.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class StripePay implements PaymentService {

	@Override
	public void pay() {
		IO.println("Pay using Stripe Pay.");
	}

}
