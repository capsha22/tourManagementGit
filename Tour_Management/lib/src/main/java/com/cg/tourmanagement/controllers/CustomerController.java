package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.cg.tourmanagement.service.CustomerServiceImpl;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.TourInfoDto;

@RestController
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
    CustomerServiceImpl custservice;
	
	@PostMapping
	public ResponseEntity<String>addPackage(@RequestBody TourInfoDto tourdto){
	custservice.AddPackage(tourdto);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{customerid}")
	public ResponseEntity<String>cancelRegistration(@RequestBody int customerId){
	custservice.cancelRegistration(customerId);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	
=======

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.service.CustomerServiceImpl;

public class CustomerController  {
	@Autowired
	CustomerServiceImpl custservice;
>>>>>>> 6c8e35353ec20e446b2be90fa737e4b8bbd774a3
	@PostMapping
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto custdto){
		custservice.addCustomer(custdto);;
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
	
	}
	@DeleteMapping("/id/{customerid}")
	public ResponseEntity<String> addPackage(@RequestBody int customerId){
		custservice.cancelRegistration(customerId);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);

    }
	
<<<<<<< HEAD
	
}
=======
}
>>>>>>> 6c8e35353ec20e446b2be90fa737e4b8bbd774a3
