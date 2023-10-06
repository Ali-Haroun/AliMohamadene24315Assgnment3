package com.auca.service;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


public class ForgotPassword extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        if (!email.isEmpty()) {
			request.getRequestDispatcher("login.html").forward(request, response);
		}else {
			PrintWriter open = response.getWriter();
			open.println("Enter the Email");
		}
        
    }
	
}
