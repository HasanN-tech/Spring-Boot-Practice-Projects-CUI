package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.hasan.sbeans.NotificationService;

@SpringBootApplication
@ImportResource("com/hasan/config/applicationContext.xml")
public class SBproj02MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj02MainApp.class, args);
		NotificationService n=ctx.getBean(NotificationService.class);
		n.notifyUser(IO.readln("Enter your message: "));
	}
}
