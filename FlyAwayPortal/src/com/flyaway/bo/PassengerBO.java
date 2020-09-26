package com.flyaway.bo;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.passenger.Passenger;

public interface PassengerBO {
public boolean createPassenger(Passenger p) throws FlyawayException;
public boolean updatePassenger(Passenger p) throws FlyawayException;
public boolean deletePassenger(Passenger p) throws FlyawayException;
public boolean searchPassenger(Passenger p) throws FlyawayException;
}
