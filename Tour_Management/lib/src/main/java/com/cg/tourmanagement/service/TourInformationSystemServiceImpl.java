package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class TourInformationSystemServiceImpl implements TourInformationSystemService {

	@Autowired
	TourInformationSystemRepository tourrepo;





	

	@Override
	public void addPackage(TourInformationSystem tour)  {
		
		
	}

	@Override
	public List<TourInformationSystem> viewAllTours() {
		return tourrepo.findAll();
	
	}

	@Override
	public Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException {
		Optional<TourInformationSystem> tour = tourrepo.findById(packageId);
		if(tour.isEmpty())
			throw new TourInformationSystemNotFoundException();
		return tour;
	}

	@Override
	public void updateTourInformationSystem(TourInformationSystem tour) {
		tourrepo.save(tour);
		
	}

	@Override
	public void deleteTourInformationSystem(int packageId) {
		tourrepo.deleteById(packageId);
		
	}

	
		
	
	
	
	

	


}
