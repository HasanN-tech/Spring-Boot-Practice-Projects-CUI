package com.hasan.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "emp")
public class EmployeeData {
	private Integer id;
	private String name;
	private String dept;
	private Double salary;
	private String company;
	private String location;
}
