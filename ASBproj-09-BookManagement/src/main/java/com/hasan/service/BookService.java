package com.hasan.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasan.DAO.BookDao;
import com.hasan.model.Book;

@Service
public class BookService implements IBookService {

	@Autowired
	private BookDao bd;
	
	public void create(String name) throws SQLException {
		bd.create(name);
	}
	
	@Override
	public String addBook(Book book) throws SQLException {
		return bd.insertBook(book);
	}

	@Override
	public List<Book> retrieveAllBooks() throws SQLException {
		return bd.getAllBooks();
	}

	@Override
	public String deleteBook(int bookId) throws SQLException{
		return bd.deleteBook(bookId);
	}

	@Override
	public String updateBook(double price, int id) throws SQLException{
		return bd.updateBook(price,id);
	}

}
