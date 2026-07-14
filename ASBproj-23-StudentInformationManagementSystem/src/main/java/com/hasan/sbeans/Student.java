package com.hasan.sbeans;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="student")
@Component
public class Student {
	private int id;
	private String name;
	private String course;
	private double fee;
	private String institute;
	private List<String> subject;
	private HashMap<String, Integer> marks;
}
