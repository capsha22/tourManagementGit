package com.cg.tourmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tourmanagement.dto.CustomerDto;
import com.cg.tourmanagement.dto.TourInfoDto;
import com.cg.tourmanagement.entities.Customer;
import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;
import com.cg.tourmanagement.repository.CustomerRepository;
import com.cg.tourmanagement.repository.TourInfoRepository;
import com.cg.tourmanagement.repository.TourInformationSystemRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository custrepo;
	@Autowired
	TourInformationSystemRepository tourrepo;
	@Autowired
	TourInfoRepository tourinforepo;

	@Override
	public void addCustomer(CustomerDto custdto)  {
		TourInformationSystem tour=tourrepo.getpackageId(custdto.getPackageId());
		TourInfo tourinfo=tourinforepo.getreservePackageId(custdto.getReserevdPackageId());
		Customer cust=new Customer();
		cust.setAge(custdto.getAge());
		cust.setFirstName(custdto.getFirstName());
		cust.setLastName(custdto.getLastName());
		cust.setMobileNo(custdto.getMobileNo());
		cust.setGender(custdto.getGender());
		cust.setUserId(custdto.getUserId());
		cust.setPassword(custdto.getPassword());
		cust.setModeOfPayment(custdto.getModeOfPayment());
		cust.setTourinfo(tourinfo);
		custrepo.save(cust);
		
	}

	

	@Override
	public void AddPackage(TourInfoDto tourinfodto) {
		TourInformationSystem tour=tourrepo.getpackageId(tourinfodto.getPackageId());
		
		
		
		
		
	}

	@Override
	public void updateTourInfo(TourInfo tourinfo) {
		
		
	}

	@Override
	public Optional<TourInfo> reserevdPackageId(int reserevdPackageId) {
		
		return null;
	}

	@Override
	public void cancelRegistration(int customerId) {
    custrepo.deleteById(customerId);
		
	}



	@Override
	public List<TourInformationSystem> getpackageName() {
		List<TourInformationSystem> tourlist=tourrepo.findAll();
		return tourlist;
	}



	
}
