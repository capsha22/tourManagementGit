package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.service.TourInformationSystemServiceImpl;

@RestController
@RequestMapping("/tour")
public class TourInformationSystemController {
	@Autowired
	TourInformationSystemServiceImpl service;
	
	@PostMapping
	public ResponseEntity<String> addPackage(@RequestBody TourInformationSystem tour){
		service.addPackage(tour);
		return new ResponseEntity<String>("inserted", HttpStatus.OK);

}
}
