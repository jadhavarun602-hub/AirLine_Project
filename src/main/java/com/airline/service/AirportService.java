package com.airline.service;

import java.util.List;
import com.airline.dto.AirportDTO;
import com.airline.entity.Airport;

public interface AirportService {

	Airport addAirport(AirportDTO dto);
	List<Airport> getAllAirports();
	Airport getAirport(int id);
	String deleteAirport(int id);
}