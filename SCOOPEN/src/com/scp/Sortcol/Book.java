package com.scp.Sortcol;

public class Book {
public Book(int bookId, String bookName, Author a) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.a = a;
	}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
	public String toString() {
		return "\n Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
private int bookId;
private String bookName;
private Author a;
}
