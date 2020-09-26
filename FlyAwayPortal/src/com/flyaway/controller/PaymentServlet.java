package com.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.bo.SearchBOImpl;
import com.flyaway.bo.TicketBOImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.passenger.Passenger;
import com.flyaway.model.ticket.Ticket;

/**
 * Servlet implementation class PaymentServlet
 */
//@WebServlet(description = "Payment Servlet", urlPatterns = { "/payment" })
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		List<Passenger> pl=(List<Passenger>)session.getAttribute("plist");
		int book=Integer.parseInt((String) session.getAttribute("Book"));
		String user=(String)session.getAttribute("username");
		String dot=(String)session.getAttribute("dot");
		List<Ticket> tl=new ArrayList<Ticket>();
		for(Passenger p:pl)
		{
			Ticket t=new Ticket();
			t.setDate_of_travel(dot);
			t.setFlight_id(book);
			t.setU_name(user);
			t.setPassenger_name(p.getP_name());
			t.setPassenger_sex(p.getP_sex());
			t.setPassenger_age(p.getP_age());
			t.setPayment_status("success");			
			TicketBOImpl tbi=new TicketBOImpl();
			Ticket ti=null;
			try {
				 ti=tbi.createTicket(t);
			} catch (FlyawayException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tl.add(ti);
		}
		out.print("<table border=1px><tr><th>Confirmed Tickets details</th></tr>");
		SearchBOImpl sbi=new SearchBOImpl();
		Flights f=null;
		try {
			f = sbi.getFlight(Integer.parseInt((String)session.getAttribute("Book")));
		} catch (NumberFormatException | FlyawayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] headers={"source","destination","airlines","Price","arrival","departure","available","Flight number","Date of Travel"};
		out.print("<tr>");
		for(String a:headers)
		{
		out.print("<th>"+a+"</th>");	
		}
		out.print("<tr>");
		out.print("<tr><td>"+f.getSource()+"</td><td>"+f.getDestination()+"</td><td>"+f.getAirlines()+"</td><td>"+f.getFprice()+"</td><td>"+f.getArrival_time_to_destination()+"</td><td>"+f.getDestination_from_source_time()+"</td><td>"+f.getAvailable()+"</td><td>"+f.getFid()+"</td><td>"+session.getAttribute("dot")+"</td></tr>");
		out.print("</table><br><br><br><br>");
		out.print("Ticket details");
		out.print("<table border=1px>");
		
		String[] headers1={"Ticket id","User","Date of Travel","Passenger name","passenger age ","passenger sex","Payment status"};
		for(String b:headers1)
			out.print("<th>"+b+"</th>");
		for(Ticket a:tl)
		{
			out.print("<tr>");
			out.print("<td>"+a.getTid()+"</td>");
			out.print("<td>"+a.getU_name()+"</td>");
			out.print("<td>"+a.getDate_of_travel()+"</td>");
			out.print("<td>"+a.getPassenger_name()+"</td>");
			out.print("<td>"+a.getPassenger_age()+"</td>");
			out.print("<td>"+a.getPassenger_sex()+"</td>");
			out.print("<td>"+a.getPayment_status()+"</td>");
			out.print("</tr>");
			
		}
		out.print("</table>");
		out.print("<br><br><br><br>");
		out.print("<a href='search.jsp'>New Booking</a>");
		
		
		
		
		
	}

}
