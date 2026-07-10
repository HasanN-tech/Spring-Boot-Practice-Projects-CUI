package com.hasan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.model.Order;

@Service
public class OrderDao implements IOrderDAO {

	@Autowired
	DataSource ds;
	
	@Override
	public String insertOrder(Order order) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Insert into Orders values(order_seq.nextVal,?,?,?)")){
			pstmt.setDate(1, order.getOrderDate());
			pstmt.setString(2, order.getName());
			pstmt.setDouble(3, order.getAmount());
			pstmt.execute();
			return "Record Inserted!";
		}
	}

	@Override
	public List<Order> getAllOrders() throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Select * from orders")){
			List<Order> l= new ArrayList<>();
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				l.add(new Order(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getDouble(4)));
			}
			return l;
		}
	}

	@Override
	public String deleteOrder(int orderId) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Delete from orders where order_id=?")){
			pstmt.setInt(1, orderId);
			pstmt.execute();
			return "Row deleted!";
		}
	}

	@Override
	public String updateOrder(double amt,int id) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Update orders set amount=? where order_id=?")){
			pstmt.setDouble(1, amt);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			return "Row Updated!";
		}
	}

	
}
