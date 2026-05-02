package com.airline.service;

import java.util.List;
import com.airline.dto.PassengerDTO;
import com.airline.entity.Passenger;

public interface PassengerService {

	Passenger addPassenger(PassengerDTO dto);
	List<Passenger> getAllPassengers();
	Passenger getPassenger(int id);
	String deletePassenger(int id);
}