package com.flyaway.bo;
import com.flyaway.model.carrier.Carrier;

import java.util.List;

import com.flyaway.exception.FlyawayException;
public interface CarrierBO {

	public boolean createCarrier(Carrier c) throws FlyawayException;
	public boolean deleteCarrier(Carrier c) throws FlyawayException;
	public boolean updateCarrier(Carrier c) throws FlyawayException;
	public List<Carrier> searchCarrier() throws FlyawayException;
}
