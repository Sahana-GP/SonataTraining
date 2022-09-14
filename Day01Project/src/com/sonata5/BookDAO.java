package com.sonata5;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	
	public List <Book>getBook(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(102, "Hibernate", 300));
		books.add(new Book(103, "Spring", 500));
		books.add(new Book(104, "ReactJS", 600));
		//books.add(new Book(101, "Core Java", 400));
	
		return books;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void add(Book book) {
		// TODO Auto-generated method stub
		
	}


	public int getSize() {
		// TODO Auto-generated method stub
		return book.size;
	}

}
