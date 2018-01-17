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
				System.out.println("POST was called");
	}			
	
	// read
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String payloadDataID;
		payloadDataID = request.getHeader("Payload-Data");
		String responseText = payloadDataID;
		response.getWriter().append(responseText);
		System.out.println("GET was called");
		
	}
	
	// Update
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				System.out.println("PUT was called");
	}
	
	// Delete
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				System.out.println("DELETE was called");
	}
}
