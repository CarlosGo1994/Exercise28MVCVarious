package com.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrimeNumbersServlet")
public class PrimeNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException {
		
		int numero = Integer.parseInt(request.getParameter("txtNumber"));
			boolean isPrime=true;
			
			for(int i=2;i<numero;i++)
			{
				if(numero%i==0)
				{
					isPrime=false;
				}
			}
			
			response.getWriter().append("Is the number prime? "+isPrime);
		
	}

}
