package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.sbeans.ProductInfo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired 
	private ProductInfo info;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);
	}

}
