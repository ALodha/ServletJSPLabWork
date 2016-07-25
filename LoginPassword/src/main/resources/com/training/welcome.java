package welcome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String userName=request.getParameter("username");  
		    out.print("Welcome "+userName);  
		          
		    out.close();  
	}

}
