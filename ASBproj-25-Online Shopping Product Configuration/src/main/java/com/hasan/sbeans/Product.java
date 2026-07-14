package com.hasan.sbeans;

import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="product")
@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String brand;
	private boolean availability;
	private List<String> Colors;
	private HashMap<String, Integer> stock;
}
