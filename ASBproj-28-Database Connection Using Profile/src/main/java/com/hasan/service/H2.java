package com.hasan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class H2 implements Databases {

	@Override
	public String chooseDatabase(String msg) {
		return msg+"H2";
	}

}
