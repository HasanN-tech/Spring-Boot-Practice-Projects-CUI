package com.hasan.sbeans;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="employee")
@Component
public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String department;
	private String company;
	private List<String> skills;
	private HashMap<String, String> projRating;
}
