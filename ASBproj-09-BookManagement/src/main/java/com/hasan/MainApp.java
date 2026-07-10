package com.hasan;

import com.hasan.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(MainApp.class, args)){
		BookController b=ctx.getBean(BookController.class);
		//b.createTable("Book");
//		b.insertBook(new Book(IO.readln("Enter Book Name: "), IO.readln("Enter Author Name: "), Double.parseDouble(IO.readln("Enter Price: "))));
		b.retrieveAllBooks();
//		b.updateBook(Double.parseDouble(IO.readln("Enter price: ")), Integer.parseInt(IO.readln("Enter Book_id: ")));
		b.deleteBook(3);
		b.retrieveAllBooks();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
