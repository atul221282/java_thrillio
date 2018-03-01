package com.semanticsquare.thrillio.exercise;

import java.util.Arrays;
import java.util.List;

import com.semanticsquare.thrillio.entities.Book;

public class Instructor {
	public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;

	public Instructor(long id, String name, String title, String department, Book[] books) {
		// your code
		this(id, name, title, department);
		this.books = books;
	}

	public Instructor(long id, String name, String title, String department) {
		// your code
		this(id, name, title);
		this.department = department;
	}

	public Instructor(long id, String name, String title) {
		// your code
		this(id, name);
		this.title = title;
	}

	public Instructor(long id, String name) {
		// your code
		this.id = id;
		this.name = name;
	}

	public String getMostRecentBookTitle() {
		// your code
		int len = books.length - 1;
		return this.books[len].getTitle();
	}

	public Book updateBook(int index, String title) {
		
		
		return new Book("");
	}

	public Book updateBook(int index, Book book) {
		// your code
		Book b = this.books[index];

		b = book;

		return b;
	}

}
