package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if(uname.equals("sahithi") && password.equals("sahithirocks")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("name", uname);
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
			
			
		}
		else {
			out.println("Incorrect username amd password");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
		
	}

	
	
	}


