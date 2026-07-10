package com.hasan.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hasan.model.Order;
import com.hasan.service.IOrderService;
@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	IOrderService ios;
	
	public void addOrder(Order order) throws SQLException {
		IO.println(ios.addOrder(order));
	}
	
	public void retrieveAllOrders() throws SQLException {
		List<Order> l=new ArrayList<>();
		l=ios.retrieveAllOrders();
		for(Order o:l) {
			IO.println(o);
		}
	}
	public void deleteOrder(int orderId) throws SQLException {
		IO.println(ios.deleteOrder(orderId));
	}
	public void updateOrder(double amt,int id) throws SQLException {
		IO.println(ios.updateOrder(amt, id));
	}
}
