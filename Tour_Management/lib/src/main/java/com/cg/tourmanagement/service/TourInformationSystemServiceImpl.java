package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;

import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class TourInformationSystemServiceImpl implements TourInformationSystemService {

	@Autowired
	TourInformationSystemRepository tourrepo;
	@Override
	public void addPackage(TourInformationSystem tour){
		Optional<TourInformationSystem> tourinformationsystem = tourrepo.findById(tour.getPackageId());
		System.out.println(tourinformationsystem);
		if(!tourinformationsystem.isEmpty())
			throw new TourInformationSystemAlreadyExistException();
		tourrepo.save(tour);		
		
	}
//	@Override
//	//public List<TourInformationSystem> viewAllTours1() {
//	
//		return tourrepo.findAll();
//	}
//
//	@Override
//	public Optional<TourInformationSystem> getTourById(int packageId){
//		Optional<TourInformationSystem> tour = tourrepo.findById(packageId);
//		if(tour.isEmpty())
//			throw new TourInformationSystemNotFoundException();
//		return tour;
//	
//	}
//
//	@Override
//	public void updateTourInformationSystem(TourInformationSystem tour) {
//		tourrepo.save(tour);
//		
//	}
//
//	@Override
//<<<<<<< HEAD
//	public List<TourInformationSystem> viewAllTours() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void updateDepartment(TourInformationSystem tour) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteDepartment(int deptno) {
//		// TODO Auto-generated method stub
//=======
//	public void deleteTourInformationSystem(int packageId) {
//		tourrepo.deleteById(packageId);
//>>>>>>> 028e796f595da142e593f5324fcd9ae873881d67
//		
}
//	
//
//
//
