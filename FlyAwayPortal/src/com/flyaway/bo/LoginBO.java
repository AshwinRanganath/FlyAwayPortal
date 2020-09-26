package com.flyaway.bo;
import com.flyaway.model.login.Login;
import com.flyaway.exception.FlyawayException;
public interface LoginBO {
	
	public boolean isValidUser(Login l) throws FlyawayException;

}
