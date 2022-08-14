package com.BikkadIT.WebResourceBookTicket.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.BikkadIT.WebResourceBookTicket.model.Passanger;
import com.BikkadIT.WebResourceBookTicket.model.Ticket;
import com.BikkadIT.WebResourceBookTicket.respository.IRCTCrepository;


@Service
public class ServiceIMPL {
	
	@Autowired
	private IRCTCrepository repository;
	
	
	public Ticket ticketStatus(Passanger passanger) {
		
		
		if(passanger.getLname()!=null) {
		
			Passanger passanger2 = repository.save(passanger);
			
			Ticket t=new Ticket();
			t.setPnr(111);
			t.setTicketprice(750.25);
			t.setTicketStatus("Confirmed");
		
			return t;

			}else {
				Ticket  ticket=new Ticket();
				ticket.setTicketStatus("Booking not confirmed");
				return ticket; 	
			}	
	}

}
