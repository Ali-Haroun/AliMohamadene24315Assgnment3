package com.auca.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;


public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("Email");
        String password = req.getParameter("password");

        if ("ally".equals(username) && "12345".equals(password)) {
            try {
            	HttpSession session = req.getSession(true);
            	session.setAttribute("name", username);
                res.sendRedirect("index.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {            
            res.sendRedirect("forgotpassword.html"); 
        }
    }
}
	
