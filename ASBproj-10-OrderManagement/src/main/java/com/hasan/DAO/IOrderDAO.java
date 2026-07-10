package com.hasan.DAO;

import java.sql.SQLException;
import java.util.List;

import com.hasan.model.Order;

public interface IOrderDAO {
	public String insertOrder(Order order) throws SQLException;
	public List<Order> getAllOrders() throws SQLException;
	public String deleteOrder(int orderId) throws SQLException;
	public String updateOrder(double amt,int id) throws SQLException;
}
