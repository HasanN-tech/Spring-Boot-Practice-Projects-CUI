package com.hasan.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Oracle implements Databases {

	@Override
	public String chooseDatabase(String msg) {
		return msg+"Oracle";
	}

}
