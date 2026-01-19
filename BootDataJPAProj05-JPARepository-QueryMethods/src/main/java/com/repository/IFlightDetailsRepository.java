package com.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.entity.FlightDetails;

import jakarta.transaction.Transactional;

public interface IFlightDetailsRepository extends JpaRepository<FlightDetails, Integer>{
	
	//@Query("from FlightDetails where capacity>=:start and capacity<=:end")
	@Query("from FlightDetails where capacity>=?1 and capacity<=?2")
	public List<FlightDetails> findByCapacity(Integer start,Integer end);
	
	@Query("select fname,company,type from FlightDetails where company in(?1,?2,?3)")
	public List<Object[]> showFlightByCompany(String com1,String com2,String com3);
	
	@Query("select fname from FlightDetails where company in(?1,?2,?3)")
	public List<String> showFnameByCompany(String com1,String com2,String com3);
	
	
	//=================================Scalar Query=====================================================
	
	@Query("from FlightDetails where fname=:name")
	public Optional<FlightDetails> showFlightByname(String name);
	
	@Query("select fname , capacity , company from FlightDetails where fname=?1")
	public Optional<Object> showFlightDataByName(String name);
	
	@Query("select capacity from FlightDetails where fname=:name")
	public Integer showFlightCapacityByFname(String name);
	
	//===================================Aggregate Operation=============================================

    @Query("select count(distinct f.company) from FlightDetails f")
	public Long showUniqueCompaniesCount();
    
    @Query("select max(capacity),min(capacity),sum(capacity),avg(capacity) from FlightDetails")
    public Object showAggregateOperations();
    
    //===================================Update==========================================================
    
    @Query("update FlightDetails set capacity=capacity+round(capacity*:hike/100) where company in(:com1,:com2,:com3)")
    @Modifying
    @Transactional
    public int updateCapacityByCompanies(String com1,String com2,String com3,double hike);
    
    
    //===================================Delete==========================================================
	
    @Query("delete from FlightDetails where capacity>= ?1 And capacity<=?2")
    @Transactional
    @Modifying
    public int deleteByCapacityRange(Integer start,Integer end);
    
    
    //===================================Nativ-SQL=======================================================
    
    @Query(value = "select now() from dual", nativeQuery = true)
    public LocalDate date();
    
}


