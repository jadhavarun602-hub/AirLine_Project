package com.airline.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airId;

	@Column(nullable = false)
	private String airName;

	@Column(nullable = false)
	private String airCity;

	@Column(nullable = false, unique = true)
	private String airCode;

	@Column(nullable = false)
	private String airCountry;

	public Airport() {
	}

	public Airport(String airName, String airCity, String airCode, String airCountry) {
		this.airName = airName;
		this.airCity = airCity;
		this.airCode = airCode;
		this.airCountry = airCountry;
	}


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