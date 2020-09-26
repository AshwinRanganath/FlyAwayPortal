package com.flyaway.dao;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.sd.Master_s_d;

public interface Master_S_D_BODao {
	public boolean createSD(Master_s_d m) throws FlyawayException;
	public boolean deleteSD(Master_s_d m) throws FlyawayException;
	public boolean searchSD(Master_s_d m) throws FlyawayException;
	public boolean updateSD(Master_s_d m) throws FlyawayException;
}
