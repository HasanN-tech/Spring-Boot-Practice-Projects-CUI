package com.hasan.sbeans;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "product")
public class ProductInfo {
	private Integer id;
	private String name;
	private Map<String, String> features;
}
