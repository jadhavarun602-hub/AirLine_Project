package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.entity.Airline;
import com.airline.repository.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepo;
	
	public String addAirline(Airline airline) {
		airlineRepo.save(airline);
		return "Airline added !";
	}
	
	
	public List<Airline> getAirlines(){
		return airlineRepo.findAll();
	}
	
	public String deleteAirlines(int id) {
		airlineRepo.deleteById(id);
		return "Airline deleted !";
	}

}
