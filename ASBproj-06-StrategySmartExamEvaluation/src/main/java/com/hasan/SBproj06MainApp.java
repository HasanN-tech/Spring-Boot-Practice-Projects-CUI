package com.hasan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hasan.sbeans.ExamPortal;

@SpringBootApplication
public class SBproj06MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SBproj06MainApp.class, args);
		ExamPortal e=ctx.getBean(ExamPortal.class);
		e.setId(111);
		e.start();
		e.result();
	}
}
