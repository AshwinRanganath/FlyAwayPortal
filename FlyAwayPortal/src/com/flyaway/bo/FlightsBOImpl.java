package com.flyaway.bo;

import java.util.ArrayList;
import java.util.List;

import com.flyaway.dao.FlightsBODaoImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;

public class FlightsBOImpl implements FlightsBO {
	FlightsBODaoImpl fdi=new FlightsBODaoImpl();

	@Override
	public List<Flights> searchFlight() throws FlyawayException {
		List<Flights> l=new ArrayList<Flights>();
		l=fdi.searchFlights();
		return l;
	}
	

}
