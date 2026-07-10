package com.hasan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hasan.model.Product;

@Repository
public class ProductDAO {
	@Autowired
	private DataSource dataSource;

	public String create(String name) throws SQLException {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(
						"CREATE TABLE "+name+" (productId INT PRIMARY KEY,productName VARCHAR2(20),description varchar2(50),price number(10,2))")) {
			pstmt.execute();
			return "Table created successfully!";
		} catch (Exception e) {
			throw e;
		}
	}

	public String drop(String name) throws SQLException {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(
						"Drop TABLE "+name)) {
			pstmt.execute();
			return "Table Deleted successfully!";
		} catch (Exception e) {
			throw e;
		}
	}
	
	public String insert(Product p) throws SQLException {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(
						"Insert into product values(prod_seq.nextVal,?,?,?)")) {
			pstmt.setString(1, p.getPName());
			pstmt.setString(2, p.getDesc());
			pstmt.setDouble(3, p.getPrice());
			pstmt.execute();
			return "Record Inserted successfully!";
		} catch (Exception e) {
			throw e;
		}
	}
	public List<Product> show(String name) throws SQLException{
		List<Product> prods=new ArrayList<>();
		try(Connection con=dataSource.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Select * from "+name);
				ResultSet rs=pstmt.executeQuery()){
			while(rs.next()) {
				prods.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
			}
			return prods;
		}catch (Exception e) {
			throw e;
		}
	}
	public String update(double newPrice, double oldPrice) throws SQLException { 
	    String sql = "UPDATE product SET price = ? WHERE price = ?";
	    
	    try (Connection con = dataSource.getConnection(); 
	         PreparedStatement pstmt = con.prepareStatement(sql)) {
	 
	        pstmt.setDouble(1, newPrice);
	        pstmt.setDouble(2, oldPrice);
	 
	        int eu = pstmt.executeUpdate();
	        if(eu>=1)
	        return "Updated Successfully!";
	        else return "Not Updated!";
	        
	    } catch (Exception e) {
			e.printStackTrace();
			return "fghj";
		}
	}
	
}
