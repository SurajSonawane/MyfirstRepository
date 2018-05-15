package com.scp.Sortcol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Author a1 = new Author();
		Book b1 = new Book();
		b1.setBookId(12);
		b1.setBookName("CoreJava");
		b1.setA(a1);
		a1.setAuthorId(13);
		a1.setAuthorName("Prasad");
		a1.setB(b1);
		Author a2 = new Author();
		Book b2 = new Book();
		b2.setBookId(15);
		b2.setBookName("Spring");
		b2.setA(a2);
		a2.setAuthorId(14);
		a2.setAuthorName("Rahul");
		a2.setB(b2);
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		
		Collections.sort(listOfBooks, SortingMechanism.sortByBookId);
		System.out.println("Sorted by book Id....");
		System.out.println(listOfBooks);
		List<Author> listOfAuthors = new ArrayList<Author>();
		listOfAuthors.add(a1);
		listOfAuthors.add(a2);
		Collections.sort(listOfAuthors,SortingMechanism.sortByAuthorId);
		System.out.println("sorted by Author id ....");
		System.out.println(listOfAuthors);
	}

}
