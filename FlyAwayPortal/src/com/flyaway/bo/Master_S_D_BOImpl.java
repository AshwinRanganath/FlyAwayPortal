package com.flyaway.bo;

import com.flyaway.exception.FlyawayException;
import com.flyaway.model.sd.Master_s_d;

import java.util.ArrayList;
import java.util.List;

import com.flyaway.bo.Master_S_D_BO;
import com.flyaway.dao.Master_S_D_BODaoImpl;

public class Master_S_D_BOImpl implements Master_S_D_BO{

	Master_S_D_BODaoImpl mdi=new Master_S_D_BODaoImpl();
	@Override
	public boolean createSD(Master_s_d m) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSD(Master_s_d m) throws FlyawayException {
		
		return false;
	}

	@Override
	public List<Master_s_d> searchSD() throws FlyawayException {
		List<Master_s_d> l=new ArrayList<Master_s_d>();
		l=mdi.searchSD();
		System.out.println("List ml from BOImpl"+l);
		return l;
	}

	@Override
	public boolean updateSD(Master_s_d m) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

}
