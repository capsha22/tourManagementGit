package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.TourInformationSystem;

@Repository
public interface TourInformationSystemRepository extends JpaRepository<TourInformationSystem, Integer> {

}
