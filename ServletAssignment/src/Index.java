import java.io.*;
 import java.sql.*;
 import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter  out =response.getWriter().append("Served at: ").append(request.getContextPath());
		String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType +"<html>\n" +
	            "<head><title>" + "Welcome" + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	            "<h1>"+"Welcome!"+"</h1>\n"+
	            "<h3>"+"Please select process"+"</h3>\n"
	            +"</body>\n"
	            +"</html>\n"+"\n"
	            +"<a href='AddStudent'>"+"add new student"+"</a>"+"<br />"
	            +"<a href='RetrieveInfo'>"+"Display student info"+"</a>");
	}


}
