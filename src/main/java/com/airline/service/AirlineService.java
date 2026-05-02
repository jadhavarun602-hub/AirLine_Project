package com.airline.service;

import java.util.List;

import com.airline.dto.AirlineDTO;
import com.airline.entity.Airline;

public interface AirlineService {

	Airline addAirline(AirlineDTO dto);
	Airline getAirline(int id);
	List<Airline> getAllAirlines();
	String deleteAirline(int id);
}