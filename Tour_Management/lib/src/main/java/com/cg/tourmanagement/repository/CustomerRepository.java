package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.tourmanagement.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	
}
