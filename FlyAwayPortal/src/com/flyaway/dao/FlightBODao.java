package com.flyaway.dao;
import com.flyaway.model.flight.Flights;
import com.flyaway.exception.FlyawayException;
public interface FlightBODao {
	public boolean createFlight(Flights f) throws FlyawayException;
	public boolean deleteFlight(Flights f) throws FlyawayException;
	public boolean update(Flights f) throws FlyawayException;
	public boolean searchFlight(Flights f) throws FlyawayException;
}
