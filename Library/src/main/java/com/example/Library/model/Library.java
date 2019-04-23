package com.example.Library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library {
	@Id
	@GeneratedValue
	private int BookId;
	private String BookName;
	private int DueDate;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getDueDate() {
		return DueDate;
	}
	public void setDueDate(int dueDate) {
		DueDate = dueDate;
	}
	
}
