package com.hasan.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasan.sbeans.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private Student student;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(student);
	}

}
