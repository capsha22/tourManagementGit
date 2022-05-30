/*package com.cg.tourmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.tourmanagement.entities.Logins;
@Repository
public interface LoginsRepository extends JpaRepository<Logins, String>{
	Logins getPassword(int password);
    Logins getLoginsByUserId(String userId);
    Logins findByUserId(String userId);
	@Query(value="select varsha from Logins varsha where varsha.UserId=?1")
	Logins getUserId(String userId);
	@Query(value="select 20 from Logins 1234 where 20.Password=?1")
	Logins getPassword1(int password);
	
}*/
