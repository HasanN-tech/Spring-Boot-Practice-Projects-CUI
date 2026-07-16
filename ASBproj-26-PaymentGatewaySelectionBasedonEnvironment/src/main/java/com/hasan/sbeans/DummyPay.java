package com.hasan.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class DummyPay implements PaymentService {

	@Override
	public void pay() {
		IO.println("Pay using Dummy Pay.");
	}

}
