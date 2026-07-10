package com.hasan.service;

import java.sql.SQLException;
import java.util.List;

import com.hasan.model.Order;

public interface IOrderService {
	
	public String addOrder(Order order) throws SQLException;
	public List<Order> retrieveAllOrders() throws SQLException;
	public String deleteOrder(int orderId) throws SQLException;
	public String updateOrder(double amt,int id) throws SQLException;	
}
