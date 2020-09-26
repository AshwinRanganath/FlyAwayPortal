package com.flyaway.model.login;
import java.io.IOException;
//import com.flyaway.model.login.Login;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import com.flyaway.bo.LoginBOImpl;
//import com.flyaway.dao.DaoBOImpl;
import com.flyaway.exception.FlyawayException;

import javax.servlet.RequestDispatcher;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public LoginServlet() {
		super();
	
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		Login l=new Login();
		l.setUsername(req.getParameter("username"));
		l.setPassword(req.getParameter("password"));
		PrintWriter out=resp.getWriter();
		RequestDispatcher rd=null;
		LoginBOImpl dbi=new LoginBOImpl();
		try {
			if(dbi.isValidUser(l))
			{   
				
				String s=(String)req.getParameter("Book");
				String s1=(String)req.getParameter("nop");
				String s2=(String)req.getParameter("dot");
				System.out.println(s);
				System.out.println(s2);
				HttpSession session=req.getSession();
				//session.setAttribute("username", l.getUsername());
			
				session.setAttribute("Book",s);
				session.setAttribute("nop", s1);
				session.setAttribute("dot", s2);
				session.setAttribute("username", l.getUsername());
				if(session.getAttribute("username").equals("admin"))					
				rd=req.getRequestDispatcher("adminHome.jsp");
				else
					rd=req.getRequestDispatcher("success.jsp");
				rd.forward(req,resp);
			
			}
		} catch (FlyawayException e) {
			// TODO Auto-generated catch block
		    req.setAttribute("errorMessage", e.getMessage());
			rd=req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
			out.print(e.getMessage());
		}
		
		
		
	}
	
	
	

}
