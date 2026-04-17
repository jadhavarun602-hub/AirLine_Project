package com.airline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tkId;
	private String tkSeatnum;
	private double tkPrice;
	private String tkFlightNum;
	
	 @ManyToOne
	 @JoinColumn(name = "airlineId")
	 private Airline airline;

	 @ManyToOne
	 @JoinColumn(name = "passId")
	 private Passenger passenger;

	 public int getTkId() {
		 return tkId;
	 }

	 public void setTkId(int tkId) {
		 this.tkId = tkId;
	 }

	 public String getTkSeatnum() {
		 return tkSeatnum;
	 }

	 public void setTkSeatnum(String tkSeatnum) {
		 this.tkSeatnum = tkSeatnum;
	 }

	 public double getTkPrice() {
		 return tkPrice;
	 }

	 public void setTkPrice(double tkPrice) {
		 this.tkPrice = tkPrice;
	 }

	 public String getTkFlightNum() {
		 return tkFlightNum;
	 }

	 public void setTkFlightNum(String tkFlightNum) {
		 this.tkFlightNum = tkFlightNum;
	 }

	 public Airline getAirline() {
		 return airline;
	 }

	 public void setAirline(Airline airline) {
		 this.airline = airline;
	 }

	 public Passenger getPassenger() {
		 return passenger;
	 }

	 public void setPassenger(Passenger passenger) {
		 this.passenger = passenger;
	 }
	 
	 
	
}
