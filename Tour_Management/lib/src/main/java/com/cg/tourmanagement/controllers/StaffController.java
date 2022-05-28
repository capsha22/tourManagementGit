package com.cg.tourmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tourmanagement.service.StaffServiceImpl;

@RestController
@RequestMapping("/tour")
public class StaffController {
	@Autowired
	StaffServiceImpl service;
	
	
	}
