package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
