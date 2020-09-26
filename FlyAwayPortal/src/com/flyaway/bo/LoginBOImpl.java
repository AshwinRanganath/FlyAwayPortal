package com.flyaway.bo;
import java.sql.SQLException;

import com.flyaway.bo.LoginBO;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.login.Login;
import com.flyaway.dao.DaoBOImpl;


public class LoginBOImpl implements LoginBO{
    private DaoBOImpl dbi=new DaoBOImpl();
	@Override
	public boolean isValidUser(Login l) throws FlyawayException {
		// TODO Auto-generated method stub
		
		boolean b=false;
		if((l.getUsername()!=null) && (l.getPassword()!=null))
		{
			b=dbi.isValidUser(l);
		}	
		else
		{
			throw new FlyawayException("Invalid user");
		}
		return b;
	}
	public static boolean checkUser(Login l) throws FlyawayException
	{
		boolean c=false;
		if(l.getName()==null || l.getName().matches("[0-9]"))
		{
			throw new FlyawayException("Name can not be null or contain numbers");
		}
		else c=true;
		if(l.getGender()==null)
		{
			throw new FlyawayException("Select gender");
		}else c=true;
		if(l.getUsername()==null)
		{
			throw new FlyawayException("User name can not be null");
		}else c=true;
		if(l.getContact()==null || (!l.getContact().matches("[0-9]{10}")))
		{
			throw new FlyawayException("Phone can not be null or contains alphabet or enter a valid phone number");
		}else c=true;
		if(l.getPassword()==null || l.getPassword().length()<8)
		{
			throw new FlyawayException("Password can not be null or less than 8 characters");
		}else 
					c=true;
		if(l.getEmail()==null || (!l.getEmail().contains("@")))
		{
			throw new FlyawayException("Invalid email address found");
		}else c=true;
		return c;
		
	}
public boolean insertUser(Login l) throws FlyawayException,SQLException
{
	boolean d=false;boolean x=false;
    d=checkUser(l);
    if(d)
    {
    	x=dbi.insertUser(l);
    }
    	
	return x;
	
}
public boolean changePassword(String u, String p) throws FlyawayException
{
	boolean cp=false;
	if(u!=null && p!=null)
	{
		cp=dbi.changePassword(u, p);
	}
	else
	{
		throw new FlyawayException("Passwor is null");
	}
	return cp;
	
}

	}

	


