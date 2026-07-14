package com.hasan.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@Profile("mysql")
@ConfigurationProperties(prefix = "mysql")
public class MySQL implements StudentDatabaseService {
	
	private String url;
	private String username;
	private String dbName;
	
	@Override
	public void connectDatabase() {
		IO.println("Connected to Database.");
	}

	@Override
	public void displayDatabaseInfo() {
		IO.println("URL: "+url);
		IO.println("Username: "+username);
		IO.println("Database Name: "+dbName);
	}
	
	
}
