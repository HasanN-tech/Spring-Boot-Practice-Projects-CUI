package com.hasan.DAO;

import java.sql.SQLException;
import java.util.List;
import com.hasan.model.Book;

public interface IBookDAO {
	public void create(String name) throws SQLException;
	public String insertBook(Book book) throws SQLException;
	public List<Book> getAllBooks() throws SQLException;
	public String deleteBook(int bookId) throws SQLException;
	public String updateBook(double price, int id) throws SQLException;
}
