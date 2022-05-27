package com.cg.tourmanagement.dto;

import com.cg.tourmanagement.entities.Customer;

public class Address {
	private int id;
	private String city;
	private  String state;
	private int pincode;
	private Customer customer;
	
	public Address(int id, String city, String state, int pincode, Customer customer) {

		this.id = id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
