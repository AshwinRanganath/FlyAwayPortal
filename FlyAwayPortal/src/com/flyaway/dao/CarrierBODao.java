package com.flyaway.dao;
import com.flyaway.model.carrier.Carrier;
import com.flyaway.exception.FlyawayException;
public interface CarrierBODao {
	public boolean createCarrier(Carrier c) throws FlyawayException;
	public boolean deleteCarrier(Carrier c) throws FlyawayException;
	public boolean updateCarrier(Carrier c) throws FlyawayException;
	public boolean searchCarrier(Carrier c) throws FlyawayException;

}
