package com.hasan;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hasan.controller.Controller;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args);
		Controller c=ctx.getBean(Controller.class);
//		c.addOrder(new Order("Nawab", 25000.0));
		c.retrieveAllOrders();
//		c.updateOrder(30000, 2);
		c.deleteOrder(3);
		c.retrieveAllOrders();
	}

}
