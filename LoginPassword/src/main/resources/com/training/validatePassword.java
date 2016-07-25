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
		          
		    String userName=request.getParameter("username");  
		    String password=request.getParameter("password");  
		
		    if(userName.equals("admin")&& password.equals("welcome")){
		    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("welcome");  
		    	 requestDispatcher.forward(request,response);  
		    }else{
		    	out.println("Sorry incorrect values");
		    	RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/index.jsp");  
		    	requestDispatcher.forward(request,response);  
		    }
	}

}
