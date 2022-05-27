package com.cg.tourmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class TourInformationSystemServiceImpl implements TourInformationSystemService {
	
	@Autowired
	TourInformationSystemRepository tourrepo;

	@Override
	public void addPackage(TourInformationSystem tour) {
		tourrepo.save(tour);
		
	}
	

}
