package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.dto.TicketDTO;
import com.airline.entity.Airline;
import com.airline.entity.Passenger;
import com.airline.entity.Ticket;
import com.airline.repository.AirlineRepository;
import com.airline.repository.PassengerRepository;
import com.airline.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepo;

	@Autowired
	private AirlineRepository airlineRepo;

	@Autowired
	private PassengerRepository passengerRepo;

	@Override
	public String addTicket(TicketDTO dto) {

		Airline airline = airlineRepo.findById(dto.getAirlineId())
				.orElseThrow(() -> new RuntimeException("Airline not found"));

		Passenger passenger = passengerRepo.findById(dto.getPassengerId())
				.orElseThrow(() -> new RuntimeException("Passenger not found"));

		Ticket ticket = new Ticket();
		ticket.setTkSeatnum(dto.getTkSeatnum());
		ticket.setTkPrice(dto.getTkPrice());
		ticket.setTkFlightNum(dto.getTkFlightNum());
		ticket.setAirline(airline);
		ticket.setPassenger(passenger);

		ticketRepo.save(ticket);

		return "Ticket booked successfully";
	}

	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepo.findAll();
	}

	@Override
	public Ticket getTicketById(int id) {
		return ticketRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Ticket not found"));
	}

	@Override
	public String deleteTicket(int id) {
		ticketRepo.deleteById(id);
		return "Ticket deleted successfully";
	}
}