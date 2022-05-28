package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class TourInformationSystemServiceImpl implements TourInformationSystemService {
	
	@Autowired
	TourInformationSystemRepository tourrepo;

	@Override
	public void addPackage(TourInformationSystem tour) {
		tourrepo.save(tour);
		
	}

	@Override
	public List<TourInformationSystem> viewAllTours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDepartment(TourInformationSystem tour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDepartment(int deptno) {
		// TODO Auto-generated method stub
		
	}
	

}
