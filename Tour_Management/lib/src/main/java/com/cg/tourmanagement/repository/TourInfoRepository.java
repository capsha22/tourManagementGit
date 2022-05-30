package com.cg.tourmanagement.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Modifying;
=======

>>>>>>> 9559b98d0bf7573eaaba30cdb466facab9774174
import org.springframework.data.jpa.repository.Query;
import com.cg.tourmanagement.entities.TourInfo;

<<<<<<< HEAD
public interface TourInfoRepository extends JpaRepository<TourInfo, Integer>{
	
	@Transactional
	@Modifying
	@Query("update t from TourInfo t set t.Status = Booked where t.reserevdPackageId = :id")
	public int Confirm(int id);
=======
public interface TourInfoRepository  extends JpaRepository<TourInfo, Integer>{
	@Query(value = "select tour from TourInfo  tour where tour.reserevdPackageId=?1")
	TourInfo getreservePackageId(int reserevdPackageId);



>>>>>>> 9559b98d0bf7573eaaba30cdb466facab9774174

}
