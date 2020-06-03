package com.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdditionTwoNumbersServlet")

public class AdditionTwoNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException 
	{
		int numero1 = Integer.parseInt(request.getParameter("txtNumber1"));
		int numero2 = Integer.parseInt(request.getParameter("txtNumber2"));
		int resultado = numero1 + numero2;
		response.getWriter().append("The sum of the two numbers is:"+resultado);
	}

}
