package com.flyaway.bo;

import java.util.List;

import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;

public interface FlightsBO {

	public List<Flights> searchFlight() throws FlyawayException;
}
