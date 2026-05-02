package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.airline.dto.PassengerDTO;
import com.airline.entity.Passenger;
import com.airline.service.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	private PassengerService service;

	@PostMapping("/add")
	public Passenger add(@RequestBody PassengerDTO dto) {
		return service.addPassenger(dto);
	}

	@GetMapping("/all")
	public List<Passenger> getAll() {
		return service.getAllPassengers();
	}

	@GetMapping("/{id}")
	public Passenger getById(@PathVariable int id) {
		return service.getPassenger(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deletePassenger(id);
	}
}