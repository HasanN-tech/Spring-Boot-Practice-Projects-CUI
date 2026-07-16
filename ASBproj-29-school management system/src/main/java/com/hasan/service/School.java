package com.hasan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@PropertySource("application.properties")
public class School {
	@Value("${school.name}")
	private String name;
	@Value("${school.city}")
	private String city;
	@Value("${school.principal}")
	private String principal;
}
