package com.scp.Sortcol;

public class Author {
	private int authorId;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorId, String authorName, Book b) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.b = b;
	}
	private String authorName;
	private Book b;
	@Override
	public String toString() {
		return "\n Author [authorId=" + authorId + ", authorName=" + authorName
				+ ", b=" + b + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	

}
