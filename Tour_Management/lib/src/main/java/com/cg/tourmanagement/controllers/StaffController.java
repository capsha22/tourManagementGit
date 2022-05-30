package com.cg.tourmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.*;
import com.cg.tourmanagement.service.StaffService;

@RestController
@RequestMapping("/tour")
public class StaffController {
	@Autowired
	StaffService service;
	
	@PostMapping
	public Staff addStaff(@RequestBody Staff tour){
		return service.addStaff(tour);
	}
	
	@PostMapping
	public Staff login(@RequestBody Staff st){
		Staff stlogin = service.ValidateUser(st);
		return stlogin;
	}
	
	@PostMapping
	public List<TourInfo> getAllTours()
	{
		List<TourInfo> lsttour = service.getAllTour();
		return lsttour;
	}
	
	@PostMapping
	public boolean Confirm(@RequestBody TourInfo resId) {
		int id = resId.getReserevdPackageId();
		return service.Confirm(id);
	}
}
