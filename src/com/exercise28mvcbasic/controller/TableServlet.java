package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException 
	{
		//Configurar el MINE type
		response.setContentType("text/html charset='utf-8'");
		
		//Configurar el output
		PrintWriter output= response.getWriter();
		
		//Obtener los parametros
		int table= Integer.parseInt(request.getParameter("txtTable"));
		int range = Integer.parseInt(request.getParameter("txtRange"));
		
		//Algoritmo
				/*for(int i=0;i<table;i++)
				{*/
					for(int j=0;j<=range;j++)
					{
						output.append("<p>");
						output.append(String.format("%d X %d = %d", table,j,table*j));
						output.append("</p>");
					}
				//}
				
				//Cerrar el output
				output.close();
				

	}

}
