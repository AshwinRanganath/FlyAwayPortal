package com.flyaway.tagclass;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.search.Search;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintResults extends SimpleTagSupport{
private List<Flights> rlist;
private Search s;
	   
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		String headers[]= {"Source","Destination","Flight Id","Airlines","Price/Fare","Departure","Arrival at Destination","Available","Number of passengers","Date of Travel","Book Flight"};
		out.print("<table border=1px>");
		out.print("<tr>");
		
		for(String s:headers)
		{
			out.print("<th>"+s+"</th>");
		}
		out.print("</tr>");
		for(Flights l:rlist)
		{
			out.print("<tr>");
			out.print("<td>"+l.getSource()+"</td>");
			out.print("<td>"+l.getDestination()+"</td>");
			out.print("<form action='bookFlight'>");
			out.print("<td><input type='hidden' value='"+l.getFid()+"' name='Book'/>"+l.getFid()+"</td>");
			out.print("<td>"+l.getAirlines()+"</td>");
			out.print("<td>"+l.getFprice()+"</td>");
			out.print("<td>"+l.getDestination_from_source_time()+"</td>");
			out.print("<td>"+l.getArrival_time_to_destination()+"</td>");
			out.print("<td>"+l.getAvailable()+"</td>");
			out.print("<td><input type='hidden' value='"+s.getNop()+"' name='nop'/>"+s.getNop()+"</td>");
			out.print("<td><input type='hidden' value='"+s.getDot()+"' name='dot'/>"+s.getDot()+"</td>");
			out.print("<td><input type='submit' value='Book'/></td>");
			out.print("</form>");
			out.print("</tr>");
		}
		out.print("</table");
		
	}
	public void setrlist(List<Flights> rlist)
	{
		this.rlist=rlist;
		
	}
	public void sets(Search s)
	{
		
		this.s=s;
	}
}
