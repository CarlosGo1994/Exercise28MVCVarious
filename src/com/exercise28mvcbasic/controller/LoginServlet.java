package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
		
	//Indico el MIME type del objeto	
	response.setContentType("text/html");
	
	PrintWriter output = response.getWriter();
	String username = request.getParameter("txtUser");
	String userpassword = request.getParameter("txtPass");
	
	output.append("<html>");
	output.append("<head>");
	output.append("<title>");
	output.append("<Data Input by the user>");
	output.append("</title>");
	output.append("</head>");
	output.append("<body>");
	output.append("<h2>");
	output.append("Credencials from the user!!!");
	output.append("</h2>");
	output.append("<p>");
	output.append("User:"+username);
	output.append("</p>");
	output.append("<p>");
	output.append("Password:"+userpassword);
	output.append("</p>");
	output.append("</body>");
	output.append("</html>");
	
	output.close();
}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	//Especificar MIME type
	response.setContentType("application/json");
	
	//Creamos el output
	PrintWriter output = response.getWriter();
	
	//Obtenemos los parametros
	String username = request.getParameter("txtUser");
	String password = request.getParameter("txtPass");
	
	//Generamos la Salida
	output.append("{");
	output.append("\"Username\":\""+username+"\",");
	output.append("\"Password\":\""+password+"\"");
	output.append("}");
	
	//Cerramos el output
	output.close();
	
	
	//String username = request.getParameter("txtUser");
	//String password = request.getParameter("txtPass");
	//response.getWriter().append("User name"+username);
	//response.getWriter().append("Password"+password);
}
		
}


