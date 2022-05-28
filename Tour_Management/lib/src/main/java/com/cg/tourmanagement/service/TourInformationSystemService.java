package com.cg.tourmanagement.service;
import java.util.List;

import java.util.Optional;

import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;

public interface TourInformationSystemService {
<<<<<<< HEAD
//	void addPackage (TourInformationSystem tour) throws TourInformationSystemAlreadyExistException;
//	List<TourInformationSystem> viewAllTours();
//	Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException;
//	void updateDepartment(TourInformationSystem tour);
//	void deleteDepartment(int deptno);

=======
	void addPackage (TourInformationSystem tour) throws TourInformationSystemAlreadyExistException;
	List<TourInformationSystem> viewAllTours();
	Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException;
	void updateTourInformationSystem(TourInformationSystem tour);
	void deleteTourInformationSystem(int packageId);
>>>>>>> ff68cb3da84262f377a80b91e87d1269845e88c4
}
