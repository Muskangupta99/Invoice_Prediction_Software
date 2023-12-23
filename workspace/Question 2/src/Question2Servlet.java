

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question2Servlet
 */
@WebServlet("/Question2Servlet")
public class Question2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//Valid Credentials : email : "abc@gmail.com"  ,password : "root" 
		 //setting response type to html
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
	     //getting the form variables
	     String email=request.getParameter("email");
	     String password=request.getParameter("password");
	     String valid="";
	     //checking if credentials are right or not
	     if(email.contentEquals("abc@gmail.com") && password.contentEquals("root"))
	    	 valid="Correct"; //setting value of valid for correct credentials
	     else 
	    	 valid="Incorrect";  //setting value for invalid credentials
	    
	     
	     out.println("<html><head><title>Validate</title></head><body>"+valid+" Credentials!</body></html>");
	}

}
