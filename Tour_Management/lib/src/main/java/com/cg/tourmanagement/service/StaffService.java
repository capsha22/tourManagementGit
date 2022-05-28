package com.cg.tourmanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.tourmanagement.entities.Staff;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.exception.StaffPasswordException;
import com.cg.tourmanagement.exception.StaffUserIdAlreadyExistsException;

@Service 
public interface StaffService {
	void addStaff (Staff staff) throws StaffUserIdAlreadyExistsException, StaffPasswordException;
	
	Optional<Staff> getUserId(String userId);
	void ViewPackage(TourInfo viewPackage);
	void acceptPackage(TourInfo acceptPackage);
	Optional<TourInfo> reserevdPackageId(int reserevdPackageId);
	void cancelRegistration(int userId );

}
