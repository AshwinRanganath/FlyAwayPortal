package com.flyaway.bo;

import java.util.ArrayList;
import java.util.List;

import com.flyaway.dao.SearchBODaoImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.search.Search;

public class SearchBOImpl implements SearchBO {

	SearchBODaoImpl sbi=new SearchBODaoImpl();
	@Override
	public List<Flights> searchFlyaway(Search s) throws FlyawayException {
		List<Flights> f= new ArrayList<Flights>();
		f=sbi.searchFlyaway(s);		
		return f;
	}
	public Flights getFlight(int flid) throws FlyawayException
	{
		Flights f=new Flights();
		f=sbi.getFlight(flid);
		return f;
		
	}

}
