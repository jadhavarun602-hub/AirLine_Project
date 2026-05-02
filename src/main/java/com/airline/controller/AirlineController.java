package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airline.dto.AirlineDTO;
import com.airline.entity.Airline;
import com.airline.service.AirlineService;

@RestController
@RequestMapping("/airline")
public class AirlineController {

	@Autowired
	private AirlineService service;

	@PostMapping("/airline-add")
	public Airline addAirline(@RequestBody AirlineDTO dto) {
		return service.addAirline(dto);
	}

	@GetMapping("get-airline/{id}")
	public Airline getAirline(@PathVariable int id) {
		return service.getAirline(id);
	}

	@GetMapping("get-airline/all")
	public List<Airline> getAll() {
		return service.getAllAirlines();
	}

	@DeleteMapping("delete-airline/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteAirline(id);
	}
}