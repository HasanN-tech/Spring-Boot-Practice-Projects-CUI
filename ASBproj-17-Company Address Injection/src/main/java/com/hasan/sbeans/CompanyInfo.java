package com.hasan.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "company")
public class CompanyInfo {
	private Integer id;
	private String name;
	private Address address;
}
