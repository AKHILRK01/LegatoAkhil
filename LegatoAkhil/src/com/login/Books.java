package com.login;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Book_Details")
public class Books {
	
@Id	
@Column(name="Id")
@GeneratedValue
	private int BookId;

@Column(name="BookDate")
	private Date BookingDate;
@Column(name="ReturnDate")
	private Date ReturnDate;
	
	//private static int counter=201;
	
	Books(){
		//counter++;
	}
	
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		this.BookId = bookId;
	}
	
	@Column(name="BookName")
	private String BookName;
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Date getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		BookingDate = bookingDate;
	}
	public Date getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}
	
	public String toString()
	{
		return "Bookid"+ this.BookId + "BookName" + this.BookName;
		
	}
}
