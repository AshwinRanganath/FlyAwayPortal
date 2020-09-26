package com.flyaway.bo;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.carrier.Carrier;

import java.util.ArrayList;
import java.util.List;

import com.flyaway.bo.CarrierBO;
import com.flyaway.dao.CarrierBODaoImpl;

public class CarrierBOImpl implements CarrierBO{

	CarrierBODaoImpl cdi=new CarrierBODaoImpl();
	
	@Override
	public boolean createCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCarrier(Carrier c) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Carrier> searchCarrier() throws FlyawayException {
		List<Carrier> l=new ArrayList<Carrier>();
		l=cdi.searchCarrier();
		return l;
	}
	

}
