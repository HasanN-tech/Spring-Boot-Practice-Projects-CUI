package com.hasan.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class StudentInfo {
	private Integer id;
	private String name;
	private String course;
	private Double fee;
	private String institute;
}
