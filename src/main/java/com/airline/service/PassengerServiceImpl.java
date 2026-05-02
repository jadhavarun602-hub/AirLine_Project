package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dto.PassengerDTO;
import com.airline.entity.Passenger;
import com.airline.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository repo;

	@Override
	public Passenger addPassenger(PassengerDTO dto) {

		Passenger p = new Passenger();
		p.setPassName(dto.getPassName());
		p.setPassAge(dto.getPassAge());
		p.setPassEmail(dto.getPassEmail());
		p.setPassGender(dto.getPassGender());
		p.setPassPhone(dto.getPassPhone());

		return repo.save(p);
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return repo.findAll();
	}

	@Override
	public Passenger getPassenger(int id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Passenger not found"));
	}

	@Override
	public String deletePassenger(int id) {
		repo.deleteById(id);
		return "Passenger deleted";
	}
}