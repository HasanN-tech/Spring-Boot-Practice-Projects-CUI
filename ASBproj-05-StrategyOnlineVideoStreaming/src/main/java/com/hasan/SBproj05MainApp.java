package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hasan.sbeans.VideoPlayer;

@SpringBootApplication
//@ImportResource("com/hasan/config/applicationContext.xml")
public class SBproj05MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj05MainApp.class, args);
		VideoPlayer c=ctx.getBean(VideoPlayer.class);
		c.setName("PK");
		c.playVideo();
		c.displayInfo();
	}
}
