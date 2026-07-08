package com.hasan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TravelService {
		
	@Autowired
	ApplicationContext ctx;
	
	public TravelStrategy travel(String type) {
		if(type.equalsIgnoreCase("bike"))
			return ctx.getBean("bike",Bike.class);
		else if(type.equalsIgnoreCase("car"))
			return ctx.getBean("car",Car.class);
		else return ctx.getBean("bus",Bus.class);
	}
}
