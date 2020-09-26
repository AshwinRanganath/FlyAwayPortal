package com.flyaway.dao;

import java.util.List;

import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.search.Search;

public interface SearchBODao {
	
	public List<Flights> searchFlyaway(Search s) throws FlyawayException;

}
