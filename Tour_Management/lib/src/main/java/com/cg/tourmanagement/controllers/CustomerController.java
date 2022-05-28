package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
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

>>>>>>> ff68cb3da84262f377a80b91e87d1269845e88c4

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.service.CustomerServiceImpl;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
    CustomerServiceImpl custservice;
	
	
	@PostMapping
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto custdto){
		custservice.addCustomer(custdto);;
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	
	
}
}