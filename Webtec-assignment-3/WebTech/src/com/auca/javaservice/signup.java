package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


public class signup extends HttpServlet{

	private static final long serialVersionUID = 1L;
	String email, password;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    email = req.getParameter("Email");
    password = req.getParameter("password");

    if (email != null && password != null) {
        res.sendRedirect("login.html");
    } else {
        PrintWriter showmes = res.getWriter();
        showmes.println("Enter Values");
    }
}
}
