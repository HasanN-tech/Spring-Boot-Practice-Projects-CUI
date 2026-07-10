package com.hasan.service;

import java.sql.SQLException;
import java.util.List;

import com.hasan.model.Book;

public interface IBookService {
	public void create(String name) throws SQLException;
	public String addBook(Book book) throws SQLException; 
	public List<Book> retrieveAllBooks() throws SQLException;
	public String deleteBook(int bookId) throws SQLException;
	public String updateBook(double price, int id) throws SQLException;
}
