package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	HttpSession session = request.getSession(true);
	String name = (String)session.getAttribute("name");
	out.println("<html>");
	out.println("<body>");
	
	out.println("<h1>Login Successfull sahithi!!!<h1>");
	out.println("</body>");
	out.println("</html>");
	
       
   
		
	}
}

