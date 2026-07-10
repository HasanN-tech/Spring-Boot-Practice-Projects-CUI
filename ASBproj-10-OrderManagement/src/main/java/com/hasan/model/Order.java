package com.hasan.model;

import java.sql.Date;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int orderId;
	private Date orderDate;
	private String name;
	private double amount;
	public Order(String name, double amount) {
		super();
		this.orderDate=Date.valueOf(LocalDate.now());
		this.name = name;
		this.amount = amount;
	}
}
