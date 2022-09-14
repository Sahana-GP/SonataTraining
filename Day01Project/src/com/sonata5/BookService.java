package com.sonata5;

import java.util.Collections;
import java.util.List;

public class BookService {

	public List<Book>getBookinSort(){
		List<Book> books = new BookDAO().getBook();
		Collections.sort(books, new MyComparator());
		return books;
	}
	
	public static void main(String args[]) {
		System.out.println(new BookService().getBookinSort());
	}
	
}