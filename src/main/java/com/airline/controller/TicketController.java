package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airline.entity.Ticket;
import com.airline.service.TicketService;

@RestController
public class TicketController {

	@Autowired
	TicketService tkService;
	
	@PostMapping("/add-tk")
	public String addTickets(@RequestBody Ticket ticket) {
		
		return tkService.addTicket(ticket);
		
	}
	
	@GetMapping("/get-tk")
	public List<Ticket> getAllTicket(){
		
		return tkService.getTickets();
	}
	
	@DeleteMapping("/delete-tk/{id}")
	public String deleteByTk(@PathVariable int id) {
		return tkService.deleteTicket(id);
	}
	
	
}
