package com.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Customer {

	@Id
	private int UserId;
	private String name;
	private String gender;
	private String PhoneNo;
	private String[] technologies;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	@Override
	public String toString() {
		return "Customer name "+name+" gender "+gender+ " Technologies"+technologies;
	}
	
	
}
