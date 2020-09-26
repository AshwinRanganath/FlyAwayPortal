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

import com.flyaway.bo.SearchBOImpl;
import com.flyaway.exception.FlyawayException;
import com.flyaway.model.flight.Flights;
import com.flyaway.model.search.Search;

/**
 * Servlet implementation class SearchController
 */
//@WebServlet(description = "Search Page Controller", urlPatterns = { "/search" })
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		List<Flights> l=new ArrayList<Flights>();
		PrintWriter out=response.getWriter();
		//out.print(request.getAttribute("search"));
		RequestDispatcher rd=null;
		SearchBOImpl sbi=new SearchBOImpl();
		try {
			l=sbi.searchFlyaway((Search)request.getAttribute("search"));
			Search m=(Search)request.getAttribute("search");
			request.setAttribute("nop",m.getNop());
			request.setAttribute("s", request.getAttribute("search"));
			out.print(l+"   Search");
			request.setAttribute("l",l);
			rd=request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);
		} catch (FlyawayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
