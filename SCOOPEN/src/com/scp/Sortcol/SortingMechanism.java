package com.scp.Sortcol;

import java.util.Comparator;

public class SortingMechanism {
static Comparator <Book> sortByBookId = new Comparator<Book>(){

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookId()-o2.getBookId();
	}
	
};
static Comparator <Book> sortByBookName = new Comparator<Book>(){

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookName().compareTo(o2.getBookName());
	}
	
};
 static Comparator<Author> sortByAuthorId = new Comparator<Author>(){

	@Override
	public int compare(Author o1, Author o2) {
		return o1.getAuthorId()-o2.getAuthorId();
	}
	
};

}
