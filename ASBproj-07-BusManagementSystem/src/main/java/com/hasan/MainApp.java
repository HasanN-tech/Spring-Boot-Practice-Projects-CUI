package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hasan.Controller.BusController;
import com.hasan.sbeans.Bus;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args)){
			BusController controller=ctx.getBean(BusController.class);
			Bus b=new Bus(IO.readln("Enter Name: "), IO.readln("Enter Color: "), Double.parseDouble(IO.readln("Enter ticket Price: ")), IO.readln("Enter Starting: "), IO.readln("Enter Destination: "));
			controller.addBuses(b);
			controller.getBuses();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
