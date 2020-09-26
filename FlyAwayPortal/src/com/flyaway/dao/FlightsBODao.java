package com.flyaway.dao;

import java.util.List;

import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;

public interface FlightsBODao {
	public List<Flights> searchFlights() throws FlyawayException;

}
