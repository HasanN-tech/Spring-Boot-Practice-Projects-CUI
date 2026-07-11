package com.hasan.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "product")
public class ProductInfo {
	private Integer pid;
	private String name;
	private String brand;
	private Double price;
	private Integer quantity;
	private String category;
}
