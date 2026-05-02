package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.airline.dto.AirportDTO;
import com.airline.entity.Airport;
import com.airline.service.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {

	@Autowired
	private AirportService service;

	@PostMapping("/add")
	public Airport add(@RequestBody AirportDTO dto) {
		return service.addAirport(dto);
	}

	@GetMapping("/all")
	public List<Airport> getAll() {
		return service.getAllAirports();
	}

	@GetMapping("/{id}")
	public Airport getById(@PathVariable int id) {
		return service.getAirport(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteAirport(id);
	}
}