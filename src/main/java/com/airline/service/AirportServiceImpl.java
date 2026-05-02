package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dto.AirportDTO;
import com.airline.entity.Airport;
import com.airline.repository.AirportRepository;

@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepository repo;

	@Override
	public Airport addAirport(AirportDTO dto) {

		Airport airport = new Airport();
		airport.setAirName(dto.getAirName());
		airport.setAirCity(dto.getAirCity());
		airport.setAirCode(dto.getAirCode());
		airport.setAirCountry(dto.getAirCountry());

		return repo.save(airport);
	}

	@Override
	public List<Airport> getAllAirports() {
		return repo.findAll();
	}

	@Override
	public Airport getAirport(int id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Airport not found"));
	}

	@Override
	public String deleteAirport(int id) {
		repo.deleteById(id);
		return "Airport deleted";
	}
}