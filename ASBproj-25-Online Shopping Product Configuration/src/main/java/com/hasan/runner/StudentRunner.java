package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.sbeans.Product;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private Product product;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(product);
	}

}
