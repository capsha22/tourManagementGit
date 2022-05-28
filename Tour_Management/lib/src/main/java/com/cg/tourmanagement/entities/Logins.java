package com.cg.tourmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class Logins {
	@Id
	private String userId;
	@SequenceGenerator(name = "pwd_seq", initialValue = 1001, 
			sequenceName = "pwd_code_gen", allocationSize =35)
	@GeneratedValue(generator = "pwd_seq", strategy = GenerationType.SEQUENCE)
	private int password;
	@Column(name="role",length=20)
	private String role;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPassword() {
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
	
	


