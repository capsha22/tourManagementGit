package com.cg.tourmanagement.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.cg.tourmanagement.entities.TourInfo;

public interface TourInfoRepository extends JpaRepository<TourInfo, Integer>{
	
	@Transactional
	@Modifying
	@Query("update t from TourInfo t set t.Status = Booked where t.reserevdPackageId = :id")
	public int Confirm(int id);

}
