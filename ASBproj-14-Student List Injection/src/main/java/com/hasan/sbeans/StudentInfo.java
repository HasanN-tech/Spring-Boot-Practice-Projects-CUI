package com.hasan.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class StudentInfo {
	private Integer id;
	private String name;
	private List<String> courses;
}
