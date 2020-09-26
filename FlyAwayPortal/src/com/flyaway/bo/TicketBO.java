package com.flyaway.bo;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.ticket.Ticket;
public interface TicketBO {

	public Ticket createTicket(Ticket t) throws FlyawayException;
	public boolean deleteTicket(Ticket t) throws FlyawayException;
	public boolean updateTicket(Ticket t) throws FlyawayException;
	public boolean searchTicket(Ticket t) throws FlyawayException;
	
}
