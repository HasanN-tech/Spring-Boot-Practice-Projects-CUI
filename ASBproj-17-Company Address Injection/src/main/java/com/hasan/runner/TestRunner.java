package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.sbeans.CompanyInfo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired 
	private CompanyInfo info;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);
	}

}
