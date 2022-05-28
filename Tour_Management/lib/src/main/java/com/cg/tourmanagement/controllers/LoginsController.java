/*package com.cg.tourmanagement.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.dto.LoginsDto;
import com.cg.tourmanagement.entities.Logins;
import com.cg.tourmanagement.service.LoginsService;
import com.cg.tourmanagement.service.LoginsServiceImpl;



@RestController
@RequestMapping("/Logins")
public class LoginsController {
	@Autowired
	LoginsServiceImpl service;

	@PostMapping
	public ResponseEntity<String> addLogins(@RequestBody Logins Logins ){
		service.addLogins(Logins);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);
		

	}
}*/
	
	


