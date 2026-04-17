package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airline.entity.Ticket;
import com.airline.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository tkRepo;
	
	
	public String addTicket(Ticket ticket) {
		
		tkRepo.save(ticket);
		
		return "Ticket Added !";
	}
	
	
	public List<Ticket> getTickets(){
		return tkRepo.findAll();
	}
	
	public String deleteTicket(int id) {
		
		tkRepo.deleteById(id);
		return "Deleted !";
	}

}
