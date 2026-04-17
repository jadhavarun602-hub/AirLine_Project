package com.airline.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passId;
	private String passName;
	private int passAge;
	private String passEmail;
	private String passGender;
	private String passPhone;
	
	@OneToMany(mappedBy= "passenger")
	private List<Ticket> ticket;

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public int getPassAge() {
		return passAge;
	}

	public void setPassAge(int passAge) {
		this.passAge = passAge;
	}

	public String getPassEmail() {
		return passEmail;
	}

	public void setPassEmail(String passEmail) {
		this.passEmail = passEmail;
	}

	public String getPassGender() {
		return passGender;
	}

	public void setPassGender(String passGender) {
		this.passGender = passGender;
	}

	public String getPassPhone() {
		return passPhone;
	}

	public void setPassPhone(String passPhone) {
		this.passPhone = passPhone;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	


}
