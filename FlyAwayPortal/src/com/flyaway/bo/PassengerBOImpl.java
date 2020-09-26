package com.flyaway.bo;

import com.flyaway.dao.PassengerBODaoImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.passenger.Passenger;

public class PassengerBOImpl implements PassengerBO{
    PassengerBODaoImpl pdi=new PassengerBODaoImpl();
	@Override
	public boolean createPassenger(Passenger p) throws FlyawayException {
		boolean b=false;
		b=pdi.createPassenger(p);
		return b;
	}

	@Override
	public boolean updatePassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchPassenger(Passenger p) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

}
