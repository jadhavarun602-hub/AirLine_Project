package com.airline.service;

import java.util.List;
import com.airline.entity.Ticket;
import com.airline.dto.TicketDTO;

public interface TicketService {

	String addTicket(TicketDTO dto);

	List<Ticket> getAllTickets();

	Ticket getTicketById(int id);

	String deleteTicket(int id);
}