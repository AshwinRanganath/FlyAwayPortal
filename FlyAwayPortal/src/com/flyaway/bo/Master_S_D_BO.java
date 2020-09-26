package com.flyaway.bo;
import java.util.List;

import com.flyaway.exception.FlyawayException;
import com.flyaway.model.sd.Master_s_d;

public interface Master_S_D_BO {
	
	public boolean createSD(Master_s_d m) throws FlyawayException;
	public boolean deleteSD(Master_s_d m) throws FlyawayException;
	public List<Master_s_d> searchSD() throws FlyawayException;
	public boolean updateSD(Master_s_d m) throws FlyawayException;

	
}
