package com.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.bo.PassengerBOImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.passenger.Passenger;

/**
 * Servlet implementation class TicketController
 */
//@WebServlet("/ticket")
public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketController() {
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
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		out.print(request.getParameter("pname0"));
		out.println(session.getAttribute("Book"));
		out.println(session.getAttribute("nop"));
		out.println(session.getAttribute("dot"));
		int nop=Integer.parseInt((String)session.getAttribute("nop"));
		List<Passenger> pl=new ArrayList<Passenger>();
		for(int i=0;i<nop;i++)
		{
			Passenger p=new Passenger();
			p.setP_age(Integer.parseInt((String)request.getParameter("page"+i)));
			p.setP_name((String)request.getParameter("pname"+i));
			p.setP_sex((String)request.getParameter("psex"+i));
			p.setUser_name((String)request.getParameter("puser"));
			pl.add(p);
			
		}
		out.print("<br>");
		out.print(pl);
		session.setAttribute("plist", pl);
		RequestDispatcher rd=request.getRequestDispatcher("fpdetail.jsp");
		rd.forward(request, response);
		
		
	}

}
