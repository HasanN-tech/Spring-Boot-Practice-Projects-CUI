package com.hasan.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class RazorPay implements PaymentService {

	@Override
	public void pay() {
		IO.println("Pay using Razor Pay.");
	}

}
