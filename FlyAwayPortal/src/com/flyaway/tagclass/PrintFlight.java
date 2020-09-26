package com.flyaway.tagclass;

import com.flyaway.model.flight.Flights;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintFlight extends SimpleTagSupport{
	private List<Flights> flist;
	   
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		String headers[]= {"Source","Destination","Flight Id","Airlines","Price/Fare","Departure","Arrival at Destination","Available"};
		out.print("<table border=1px>");
		out.print("<tr>");
		for(String s:headers)
		{
			out.print("<th>"+s+"</th>");
		}
		out.print("</tr>");
		for(Flights l:flist)
		{
			out.print("<tr>");
			out.print("<td>"+l.getSource()+"</td>");
			out.print("<td>"+l.getDestination()+"</td>");
			out.print("<td>"+l.getFid()+"</td>");
			out.print("<td>"+l.getAirlines()+"</td>");
			out.print("<td>"+l.getFprice()+"</td>");
			out.print("<td>"+l.getDestination_from_source_time()+"</td>");
			out.print("<td>"+l.getArrival_time_to_destination()+"</td>");
			out.print("<td>"+l.getAvailable()+"</td>");
			out.print("</tr>");
		}
		out.print("</table");
		
	}
	public void setflist(List<Flights> flist)
	{
		this.flist=flist;
	}


}
