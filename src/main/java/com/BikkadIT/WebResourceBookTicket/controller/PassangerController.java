package com.BikkadIT.WebResourceBookTicket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.WebResourceBookTicket.model.Passanger;
import com.BikkadIT.WebResourceBookTicket.model.Ticket;
import com.BikkadIT.WebResourceBookTicket.service.ServiceIMPL;



@RestController
public class PassangerController {

	@Autowired
	private ServiceIMPL serviceIMPL;
	
	@PostMapping(value = "/bookticket" ,consumes = "application/json", produces="application/json")
	public ResponseEntity<Ticket> bookTicket( @RequestBody  Passanger passanger){
	
		Ticket ticketstatus = serviceIMPL.ticketStatus(passanger);

	System.out.println(passanger);

	if(ticketstatus!=null) {
	
		return new ResponseEntity<Ticket> (ticketstatus,HttpStatus.OK);
	
	}else {
		
		Ticket ticket=new Ticket();
		ticket.getTicketStatus();
		
	System.out.println("Booking not confirmed");
	return new ResponseEntity<Ticket> (ticketstatus,HttpStatus.NO_CONTENT);

	}
	

	}

}
