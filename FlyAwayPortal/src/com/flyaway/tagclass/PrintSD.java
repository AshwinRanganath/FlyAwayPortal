package com.flyaway.tagclass;
import com.flyaway.model.sd.Master_s_d;
import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintSD extends SimpleTagSupport{
	private List<Master_s_d> sdlist;
   
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		String headers[]= {"ID","SOURCE","DESTINATION"};
		out.print("<table border=1px>");
		out.print("<tr>");
		for(String s:headers)
		{
			out.print("<th>"+s+"</th>");
		}
		out.print("</tr>");
		for(Master_s_d l:sdlist)
		{
			out.print("<tr>");
			out.print("<td>"+l.getSd_id()+"</td>");
			out.print("<td>"+l.getSource()+"</td>");
			out.print("<td>"+l.getDestination()+"</td>");
			out.print("</tr>");
		}
		out.print("</table");
		
	}
	public void setSdlist(List<Master_s_d> sdlist)
	{
		this.sdlist=sdlist;
	}

	
}
