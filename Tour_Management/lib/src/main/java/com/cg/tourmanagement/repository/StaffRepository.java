package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tourmanagement.entities.Staff;

public interface StaffRepository extends JpaRepository< Staff , String> {

}
