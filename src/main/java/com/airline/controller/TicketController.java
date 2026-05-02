package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.airline.dto.TicketDTO;
import com.airline.entity.Ticket;
import com.airline.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketService service;

	@PostMapping("/add")
	public String addTicket(@RequestBody TicketDTO dto) {
		return service.addTicket(dto);
	}

	@GetMapping("/all")
	public List<Ticket> getAllTickets() {
		return service.getAllTickets();
	}

	@GetMapping("/{id}")
	public Ticket getById(@PathVariable int id) {
		return service.getTicketById(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteTicket(id);
	}
}