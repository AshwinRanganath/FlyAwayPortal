package com.flyaway.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookServlet
 */
//@WebServlet("/bookFlight")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(request.getParameter("Book")+" Bookservlet");
		System.out.println(request.getAttribute("search"));
		//request.getAttribute("s");
		request.setAttribute("Book", request.getParameter("Book"));
		request.setAttribute("nop", request.getParameter("nop"));
		request.setAttribute("dot", request.getParameter("dot"));
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");		
	rd.forward(request, response);
		
	}

}
