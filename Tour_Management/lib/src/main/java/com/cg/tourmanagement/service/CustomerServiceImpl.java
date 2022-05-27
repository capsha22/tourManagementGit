package com.cg.tourmanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.tourmanagement.Exception.CustomerPasswordException;
import com.cg.tourmanagement.Exception.CustomerUserIdAlreadyExistsException;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public void addCustomer(Customer customer) throws CustomerUserIdAlreadyExistsException, CustomerPasswordException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TourInformationSystem> getpackageName(String packageName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddPackage(TourInfo packagename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTourInfo(TourInfo tourinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TourInfo> reserevdPackageId(int reserevdPackageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelRegistration(int customerId) {
		// TODO Auto-generated method stub
		
	}

}
