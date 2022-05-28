package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.tourmanagement.service.CustomerServiceImpl;

public class CustomerController  {
	@Autowired
	CustomerServiceImpl service;
	
	
	@DeleteMapping("/id/{customerid}")
	public ResponseEntity<String> addPackage(@RequestBody int customerId){
		service.cancelRegistration(customerId);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);


}
}