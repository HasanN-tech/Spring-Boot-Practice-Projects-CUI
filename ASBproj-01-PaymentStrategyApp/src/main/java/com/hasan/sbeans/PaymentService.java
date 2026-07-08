package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
//	@Autowired
//	private UPI upi;
//	@Autowired
//	private Card card;
//	@Autowired
//	private Cash cash;
	
	@Value("${payment.amount}")
	private double amount;
	
	@Autowired
	@Qualifier("payment")
	private PaymentStrategy ps;
	
	
	public void makePayment() {
		ps.pay(amount);
	}
}
