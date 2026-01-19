package com.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.repository.IFlightDetailsRepository;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private IFlightDetailsRepository service;

	@Override
	public void run(String... args) throws Exception {

            try {
            	
//               service.findByCapacity(100, 200).forEach(System.out::println);
//               System.out.println("========================================");
//               service.showFlightByCompany("INDIGO","AIR INDIA","VISTARA").forEach(r->{
//            	   System.out.println(Arrays.toString(r));
//               });
//               System.out.println("========================================");
//               service.showFnameByCompany("INDIGO","AIR INDIA","VISTARA").forEach(System.out::println);
            	
//            	Optional<FlightDetails> opt = service.showFlightByname("QP1220");
//            	if(opt.isPresent()) {
//            		System.out.println(opt.get());
//            	}else {
//            		System.out.println("No record found...........");
//            	}
            	
//            	Optional<Object> opt = service.showFlightDataByName("QP122");
//            	if(opt.isPresent()) {
//            		System.out.println(Arrays.toString((Object[])opt.get()));
//            	}else {
//            		System.out.println("No record found...........");
//            	}
            	
 //           	System.out.println("Capacity = "+service.showFlightCapacityByFname("QP122"));
            	
  //          	System.out.println("No of Unique Companies is : "+service.showUniqueCompaniesCount());
            	
//            	Object[] object =(Object[]) service.showAggregateOperations();
//            	System.out.println(Arrays.toString(object));
//            	
//            	int i = service.updateCapacityByCompanies("INDIGO", "AIR INDIA", "AKASA", 15);
//            	System.out.println(i+" records are updated successfully");
//				
            	
//            	int i = service.deleteByCapacityRange(100,140);
//            	System.out.println(i+" records are deleted successfully");
            	
            	LocalDate date = service.date();
            	System.out.println(date);
            	
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

}
