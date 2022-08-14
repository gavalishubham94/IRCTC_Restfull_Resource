package com.BikkadIT.WebResourceBookTicket.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

public class Passanger {

     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passanger_id")
	private Integer pid;
	@Column(name = "FirstName")
	private String fname;
	@Column(name = "LastName")
	private String lname;
	@Column(name = "Origin")
	private String from;
	@Column(name = "Destination")
	private String to;
	@Column(name = "StartDate")
	private String dateOfJourney;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	@Override
	public String toString() {
		return "Passanger [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
	
	
}
