package com.hasan.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.DAO.IOrderDAO;
import com.hasan.model.Order;

@Service
public class OrderService implements IOrderService {

	@Autowired
	IOrderDAO iod;
	
	@Override
	public String addOrder(Order order) throws SQLException {
		return iod.insertOrder(order);
	}

	@Override
	public List<Order> retrieveAllOrders() throws SQLException {
		return iod.getAllOrders();
	}

	@Override
	public String deleteOrder(int orderId) throws SQLException {
		return iod.deleteOrder(orderId);
	}

	@Override
	public String updateOrder(double amt, int id) throws SQLException {
		return iod.updateOrder(amt, id);
	}

}
