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

import com.hasan.model.Book;

@Repository
public class BookDao implements IBookDAO{
	@Autowired
	private DataSource ds;
	
	@Override
	public void create(String name) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("create table "+name+" (book_id number(5) primary Key,"
						+ "title varchar2(25), author varchar2(25), price number(8,2))")){
			
			pstmt.execute();
			IO.println("Table Created!");
		}
	}

	@Override
	public String insertBook(Book book) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("insert into book values(book_seq.nextVal,?,?,?)")){
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.execute();
			return "Book Inserted!";
		}
	}

	@Override
	public List<Book> getAllBooks() throws SQLException {
		List<Book> l=new ArrayList<>();
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("select * from book")){
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				l.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
			}
			return l;
		}
	}

	@Override
	public String deleteBook(int bookId) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("delete from book where book_id=?")){
			 pstmt.setInt(1, bookId);
		        int rowsAffected = pstmt.executeUpdate(); // Changed to executeUpdate()
		        
		        if (rowsAffected > 0) {
		            return "Book Deleted!";
		        } else {
		            return "Book not found / deleted!";
		        }
		}
	}

	@Override
	public String updateBook(double price, int id) throws SQLException {
		try(Connection con=ds.getConnection();
				PreparedStatement pstmt=con.prepareStatement("Update book set price=? where book_id=?")){
			
			pstmt.setDouble(1,price);
			pstmt.setInt(2, id);
			int i = pstmt.executeUpdate();
			if(i>=1) return "Price Updated!";
			else return "price not Updated!";
		}
	}
}
