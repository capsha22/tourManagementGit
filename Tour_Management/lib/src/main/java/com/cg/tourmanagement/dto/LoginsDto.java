package com.cg.tourmanagement.dto;

public class LoginsDto {

	private String userId;
	private int password;
	private String role;
	
	public LoginsDto(String userId, int password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	public  String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public  int getPassword() {
		
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	}