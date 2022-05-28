package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream
import org.springframework.data.jpa.repository.Query;

import com.cg.tourmanagement.entities.TourInfo;

public interface TourInfoRepository  extends JpaRepository<TourInfo, Integer>{
	@Query(value = "select tour from TourInfo  tour where tour.reserevdPackageId=?1")
	TourInfo getreservePackageId(int reserevdPackageId);
=======

import com.cg.tourmanagement.entities.TourInfo;
import com.cg.tourmanagement.entities.TourInformationSystem;

public interface TourInfoRepository extends JpaRepository<TourInfo, Integer>{
>>>>>>> Stashed changes

}
