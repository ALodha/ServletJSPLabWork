package com.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validatePassword
 */
public class validatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		   User user= new User();
		   user.setKey("Monday");
		   user.setValue("Today is "+user.getKey());
		   
		   //getServletContext().setAttribute();
		   RequestDispatcher requestDispatcher=request.getRequestDispatcher("/welcome.jsp");  
		   request.setAttribute("user",user);
	       requestDispatcher.forward(request,response); 
	}

}
