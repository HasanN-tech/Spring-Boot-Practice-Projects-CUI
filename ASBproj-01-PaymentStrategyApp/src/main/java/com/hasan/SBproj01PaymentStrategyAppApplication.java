package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.hasan.sbeans.PaymentService;

@SpringBootApplication
@ImportResource("com/hasan/config/applicationContext.xml")
public class SBproj01PaymentStrategyAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj01PaymentStrategyAppApplication.class, args);
		PaymentService ps=ctx.getBean(PaymentService.class);
		ps.makePayment();
	}

}
