package com.hasan;

import com.hasan.controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args)){
		ProductController pc=ctx.getBean(ProductController.class);
		//pc.createTable(IO.readln("Enter Table name: "));
		//pc.delete(IO.readln("Enter Table name: "));
//		pc.insert(new Product("Laptop","i7", 2000.0));
//		pc.insert(new Product("Mobile","5g", 20000.0));
//		pc.show("product");
		pc.update(25000.0, 35000.0);
		pc.show("Product");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
