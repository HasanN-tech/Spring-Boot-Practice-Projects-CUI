package com.hasan.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "emp")
public class EmpInfo {
	private Integer id;
	private String name;
	private String[] skills;
}
