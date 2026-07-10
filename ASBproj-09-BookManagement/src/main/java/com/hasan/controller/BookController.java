package com.hasan.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hasan.model.Book;
import com.hasan.service.IBookService;
@Controller
public class BookController {
	@Autowired
	private IBookService ib;
	
	public void createTable(String name) throws SQLException {
		ib.create(name);
	}
	
	public void insertBook(Book book) throws SQLException {
		IO.println(ib.addBook(book));
	}
	public void retrieveAllBooks() throws SQLException {
		List<Book> l=ib.retrieveAllBooks();
		for(Book b:l) {
			IO.println(b);
		}
	}
	public void deleteBook(int bookId) throws SQLException {
		IO.println(ib.deleteBook(bookId));
	}
	public void updateBook(double price, int id) throws SQLException {
		IO.println(ib.updateBook(price,id));
	}
	
}
