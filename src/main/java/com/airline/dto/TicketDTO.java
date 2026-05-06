package com.airline.dto;

public class TicketDTO {

	private String tkSeatnum;
	private double tkPrice;
	private String tkFlightNum;
	private int airlineId;
	private int passengerId;

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

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
}