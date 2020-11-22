import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	 
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Using GET Method to Read Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	         String fname="Haziq";
	         String lname="MohdLip";
	         String fail="Invalid login data";
	         String input1=request.getParameter("first_name");
	         String input2=request.getParameter("last_name");
	      
	      if(request.getParameter("first_name").equals(fname)&&
	      request.getParameter("last_name").equals(lname)) {
	    	  out.println();
	    	  out.println(docType +
	    		         "<html>\n" +
	    		            "<head><title>" + title + "</title></head>\n" +
	    		            "<body bgcolor = \"#f0f0f0\">\n" +
	    		               "<h1 align = \"center\">" + title + "</h1>\n" +
	    		               "<ul>\n" +
	    		                  "  <li><b>Welcome!</b>: \n\n"+
	    		                  "<p>"+ input1+" "+ input2 +"</p>"+"</li>"+
	    		               "</ul>\n" +
	    		                  "<a href=\"Index\">"+"Go to the home page"+"</a>"+
	    		            "</body>" +
	    		         "</html>"
	    		      );
	      }
	      else
	    	  out.println(docType+"<font size=\"12px\" color=\"" + "red" + "\">" +
	    		         fail
	    			  +"</p>");
	      
	      
	   }
	}

