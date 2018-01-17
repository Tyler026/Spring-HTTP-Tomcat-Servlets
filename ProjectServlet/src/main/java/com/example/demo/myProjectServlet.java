package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/myProjectServlet")
public class myProjectServlet extends HttpServlet {
	
	private static final long serialVersionUID = -5231806827666242221L;

	// throws ServletException
	public void init() throws ServletException {
		super.init();
	}
	
	// resource management
	public void destroy() {
		super.destroy();
	}
	
	// Create
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.getHeaderNames();
			String responseText = "Data can be created using this method (POST)";
			response.getWriter().append(responseText);
			System.out.println("POST was called");
	}			
	
	// read
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.getHeaderNames();
			String responseText = "GET is used to read information.";
			response.getWriter().append(responseText);
			System.out.println("GET was called");
		
	}
	
	// Update
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.getHeaderNames();
			String responseText = "Use this (PUT) to update information";
			response.getWriter().append(responseText);
			System.out.println("PUT was called");
	}
	
	// Delete
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.getAttributeNames();
			String responseText = "Only use DELETE to remove the specified target";
			response.getWriter().append(responseText);
			System.out.println("DELETE was called");
	}
}
