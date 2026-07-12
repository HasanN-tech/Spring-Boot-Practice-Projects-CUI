package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.service.PaymentService;

@Component
public class PaymentRunner implements CommandLineRunner{
	@Autowired
	private PaymentService paymentService;
	
	@Override
	public void run(String... args) throws Exception {
		paymentService.makePayment();
		paymentService.showDetails();		
	}
}
