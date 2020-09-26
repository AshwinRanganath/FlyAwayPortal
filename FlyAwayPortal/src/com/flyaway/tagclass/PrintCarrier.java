package com.flyaway.tagclass;
import com.flyaway.model.carrier.Carrier;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintCarrier extends SimpleTagSupport{
	
	private List<Carrier> cList;
	   
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		String headers[]= {"ID","Airlines","Flight Id"};
		out.print("<table border=1px>");
		out.print("<tr>");
		for(String s:headers)
		{
			out.print("<th>"+s+"</th>");
		}
		out.print("</tr>");
		for(Carrier l:cList)
		{
			out.print("<tr>");
			out.print("<td>"+l.getCid()+"</td>");
			out.print("<td>"+l.getCname()+"</td>");
			out.print("<td>"+l.getFid()+"</td>");
			out.print("</tr>");
		}
		out.print("</table");
		
	}
	public void setcList(List<Carrier> cList)
	{
		this.cList=cList;
	}

}
