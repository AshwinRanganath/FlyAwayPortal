package com.flyaway.bo;

import com.flyaway.dao.TicketBODaoImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.ticket.Ticket;

public class TicketBOImpl implements TicketBO{

	@Override
	public Ticket createTicket(Ticket t) throws FlyawayException {
		TicketBODaoImpl tdi=new TicketBODaoImpl();
	    Ticket t1=tdi.createTicket(t);		
		return t1;
	}

	@Override
	public boolean deleteTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchTicket(Ticket t) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
