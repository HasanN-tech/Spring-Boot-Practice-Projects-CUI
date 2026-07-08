package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hasan.sbeans.CabBooking;

@SpringBootApplication
//@ImportResource("com/hasan/config/applicationContext.xml")
public class SBproj04MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj04MainApp.class, args);
		CabBooking c=ctx.getBean(CabBooking.class);
		c.bookCab();
		c.generateBill();
	}
}
