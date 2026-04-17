package com.airline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Airport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int airId;
	private String airName;
	private String airCity;
	private String airCode;
	private String airCountry;
	
	
	public int getAirId() {
		return airId;
	}
	public void setAirId(int airId) {
		this.airId = airId;
	}
	public String getAirName() {
		return airName;
	}
	public void setAirName(String airName) {
		this.airName = airName;
	}
	public String getAirCity() {
		return airCity;
	}
	public void setAirCity(String airCity) {
		this.airCity = airCity;
	}
	public String getAirCode() {
		return airCode;
	}
	public void setAirCode(String airCode) {
		this.airCode = airCode;
	}
	public String getAirCountry() {
		return airCountry;
	}
	public void setAirCountry(String airCountry) {
		this.airCountry = airCountry;
	}
	
	
}
