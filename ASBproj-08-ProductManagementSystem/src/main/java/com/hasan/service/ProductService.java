package com.hasan.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.DAO.ProductDAO;
import com.hasan.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO dao;
	
	public String createTable(String name) throws SQLException {
		return dao.create(name);
	}
	
	public String drop(String name) throws SQLException {
		return dao.drop(name);
	}
	
	public String insert(Product p) throws SQLException {
		return dao.insert(p);
	}
	
	public List<Product> show(String name) throws SQLException{
		return dao.show(name);	
	}
	public String update(double p1, double p2) throws SQLException {
		IO.println("s");
		return dao.update(p1, p2);
	}
}
