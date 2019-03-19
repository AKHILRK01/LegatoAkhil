package com.login;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class LoginDetails {
	@Id
	private int UserId;
	private String password;
	
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
