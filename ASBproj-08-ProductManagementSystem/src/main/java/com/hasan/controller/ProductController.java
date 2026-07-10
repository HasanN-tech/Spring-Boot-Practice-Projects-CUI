package com.hasan.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hasan.model.Product;
import com.hasan.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	public void createTable(String name) throws SQLException {
		IO.println(productService.createTable(name));
	}
	public void delete(String name) throws SQLException {
		IO.println(productService.drop(name));
	}
	public void insert(Product p) throws SQLException {
		IO.println(productService.insert(p));
	}
	public void show(String name) throws SQLException{
		List<Product> list=productService.show(name);
		for(Product p:list) {
			IO.println(p);
		}
	}
	public void update(double p1,double p2) throws SQLException {
		IO.println("C");
		IO.println(productService.update(p1, p2));
	}
	
}
