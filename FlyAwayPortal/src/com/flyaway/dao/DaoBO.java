package com.flyaway.dao;
import com.flyaway.model.login.Login;
import com.flyaway.exception.FlyawayException;

public interface DaoBO {
	
public boolean isValidUser(Login l)	throws FlyawayException;

}
