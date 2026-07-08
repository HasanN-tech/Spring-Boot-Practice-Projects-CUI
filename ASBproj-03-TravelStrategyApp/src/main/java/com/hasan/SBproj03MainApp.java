package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.hasan.sbeans.TravelService;

@SpringBootApplication
//@ImportResource("com/hasan/config/applicationContext.xml")
public class SBproj03MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj03MainApp.class, args);
		TravelService t=ctx.getBean(TravelService.class);
		t.travel(IO.readln("Enter the vehicle type: ")).startJourney();
	}
}
