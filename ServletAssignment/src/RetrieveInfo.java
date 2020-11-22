import java.io.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/RetrieveInfo")
public class RetrieveInfo extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter().append("Served at: ").append(request.getContextPath());
		String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		
		out.println(docType+"<html>\n"
				+"<head><title>"+"Retrieve Info"+"</title></head>\n"
				+"<h1>"+"Select Student"+"</h1>\n"
				+"<form action = \"RetrieveInfoProcess\" method = \"GET\">\n"
				+"<label for=\"id\">"+"Students's ID"+"</label>\n"
				+" <input type=\"text\" placeholder=\"ID\" name=\"id\" required>\n"+"<br />"
				+ "<a href=\"RetrieveInfoProcess\">"
				+	"<button type='submit'>View Info</button>"
				+"</html>");
	}




}
