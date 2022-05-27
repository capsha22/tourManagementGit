package com.cg.tourmanagement.dto;

import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

public class Customer {
	private String customerId;
	private String userId;
	private int password;
	private String firstName;
	private String lastName;
	private long mobileNo;
	private int age;
	private String gender;
	private String modeOfPayment;
	private  TourInformationSystem Tour;
	private TourInfo tourinfo;
	
	public Customer(String customerId, String userId, int password, String firstName, String lastName, long mobileNo,
			int age, String gender, String modeOfPayment, TourInformationSystem tour, TourInfo tourinfo) {
		
		this.customerId = customerId;
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.age = age;
		this.gender = gender;
		this.modeOfPayment = modeOfPayment;
		Tour = tour;
		this.tourinfo = tourinfo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public TourInformationSystem getTour() {
		return Tour;
	}
	public void setTour(TourInformationSystem tour) {
		Tour = tour;
	}
	public TourInfo getTourinfo() {
		return tourinfo;
	}
	public void setTourinfo(TourInfo tourinfo) {
		this.tourinfo = tourinfo;
	}
	
	
}
