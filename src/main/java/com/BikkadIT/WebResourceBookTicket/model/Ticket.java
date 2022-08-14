 package com.BikkadIT.WebResourceBookTicket.model;


public class Ticket {

	private int pnr;
	private String ticketStatus;
	private double ticketprice;
	
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public double getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", ticketStatus=" + ticketStatus + ", ticketprice=" + ticketprice + "]";
	}
	
	
	
}
