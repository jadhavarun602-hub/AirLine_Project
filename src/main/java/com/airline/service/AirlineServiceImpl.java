package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dto.AirlineDTO;
import com.airline.entity.Airline;
import com.airline.exception.AirlineNotFoundException;
import com.airline.exception.DuplicateAirlineFoundException;
import com.airline.repository.AirlineRepository;

@Service
public class AirlineServiceImpl implements AirlineService {

	@Autowired
	private AirlineRepository repo;

	@Override
	public Airline addAirline(AirlineDTO dto) {

		if (repo.findByAirlineName(dto.getAirlineName()).isPresent()) {
			throw new DuplicateAirlineFoundException("Airline already exists");
		}

		Airline airline = new Airline();
		airline.setAirlineName(dto.getAirlineName());
		airline.setAirlineCode(dto.getAirlineCode());
		airline.setAirlineCountry(dto.getAirlineCountry());

		return repo.save(airline);
	}

	@Override
	public Airline getAirline(int id) {
		return repo.findById(id)
				.orElseThrow(() -> new AirlineNotFoundException("Airline not found"));
	}

	@Override
	public List<Airline> getAllAirlines() {
		return repo.findAll();
	}

	@Override
	public String deleteAirline(int id) {
		repo.deleteById(id);
		return "Deleted successfully";
	}
}