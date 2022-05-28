package com.cg.tourmanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.exception.StaffPasswordException;
import com.cg.tourmanagement.exception.StaffUserIdAlreadyExistsException;

@Service 
public class StaffServiceImpl implements StaffService {

	@Override
	public void addStaff(Staff staff) throws StaffUserIdAlreadyExistsException, StaffPasswordException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Staff> getUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ViewPackage(TourInfo viewPackage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptPackage(TourInfo acceptPackage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TourInfo> reserevdPackageId(int reserevdPackageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelRegistration(int userId) {
		// TODO Auto-generated method stub
		
	}

}
