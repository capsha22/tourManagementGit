package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.tourmanagement.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query(value="select cust from Customer cust where cust.customerId=?1")
	Customer getBycustId(int customerId);
	
}
