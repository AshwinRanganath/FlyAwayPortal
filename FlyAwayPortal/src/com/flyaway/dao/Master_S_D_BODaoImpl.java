package com.flyaway.dao;
import com.flyaway.bo.Master_S_D_BO;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.sd.Master_s_d;
import com.flyaway.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import com.flyaway.model.sd.Master_s_d;
public class Master_S_D_BODaoImpl implements Master_S_D_BO{

	@Override
	public boolean createSD(Master_s_d m) throws FlyawayException {
		boolean b=false;
        try(Connection conn=DBConnection.getConnection())
        {
        	String sql="{CALL createSD(?,?)}";
			CallableStatement cs=conn.prepareCall(sql);
			cs.setString(1,m.getSource());
			cs.setString(2,m.getDestination());				

			cs.execute();
			b=true;
			System.out.println("Call procedure createSD :"+b);
        }
        catch(ClassNotFoundException | SQLException e)
        {
        	System.out.println(e.getMessage());
        }
		return b;
	}

	@Override
	public boolean deleteSD(Master_s_d m) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Master_s_d> searchSD() throws FlyawayException {
		List<Master_s_d> ml=new ArrayList<Master_s_d>();
		try(Connection conn=DBConnection.getConnection())
		{
		String sql="select * from master_s_d";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		//List<Master_s_d> ml=new ArrayList<Master_s_d>();
		
		while(rs.next())
		{
		  Master_s_d m=new Master_s_d();
		  m.setSd_id(rs.getInt("sd_id"));	
		  m.setSource(rs.getString("source"));
		  m.setDestination(rs.getString("destination"));
		  System.out.println("m:"+m);
		  ml.add(m);
		  System.out.println("ml in while"+ml);
		}
		System.out.println("List ml:"+ml);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ml;
	}

	@Override
	public boolean updateSD(Master_s_d m) throws FlyawayException {
		// TODO Auto-generated method stub
		return false;
	}


}
