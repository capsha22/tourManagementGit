package com.cg.tourmanagement.service;
import java.util.List;

<<<<<<< Updated upstream
import java.util.List;
import java.util.Optional;

=======
import  com.cg.tourmanagement.entities.TourInfo;
>>>>>>> Stashed changes
import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.exception.TourInformationSystemAlreadyExistException;
import com.cg.tourmanagement.exception.TourInformationSystemNotFoundException;

public interface TourInformationSystemService {
<<<<<<< Updated upstream
	void addPackage (TourInformationSystem tour) throws TourInformationSystemAlreadyExistException;
//	List<TourInformationSystem> viewAllTours();
//	Optional<TourInformationSystem> getTourById(int packageId) throws TourInformationSystemNotFoundException;
//	void updateTourInformationSystem(TourInformationSystem tour);
//	void deleteTourInformationSystem(int packageId);
=======
	void addPackage (TourInformationSystem tour);
	
	
>>>>>>> Stashed changes

}
