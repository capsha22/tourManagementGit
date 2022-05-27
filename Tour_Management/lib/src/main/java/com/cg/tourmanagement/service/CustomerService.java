package com.cg.tourmanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.tourmanagement.Exception.CustomerPasswordException;
import com.cg.tourmanagement.Exception.CustomerUserIdAlreadyExistsException;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

@Service
public interface CustomerService {
	void addCustomer(Customer customer) throws CustomerUserIdAlreadyExistsException, CustomerPasswordException;
	
	Optional<TourInformationSystem> getpackageName(String packageName);
	void AddPackage(TourInfo packagename);
	void updateTourInfo(TourInfo tourinfo);
	Optional<TourInfo> reserevdPackageId(int reserevdPackageId);
	void cancelRegistration(int customerId );

}
