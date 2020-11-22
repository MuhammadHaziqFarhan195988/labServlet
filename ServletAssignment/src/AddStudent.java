

import java.io.IOException;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String title="Add new Student";
		
		PrintWriter out = response.getWriter();
		String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType+"<html>\n"+"<head><title>"+title+"</title></head>\n"
				+"<h1>"+title+"</h1>\n"
				+"<body>\n"+"<form action = \"AddStudentProcess\" method = \"GET\">\n"
				+"<label for=\"name\">"+"Students's Name"+"</label>\n"
				+" <input type=\"text\" placeholder=\"Name\" name=\"name\" required>\n"+"<br />"
				+"<label for=\"id\">"+"Students's ID"+"</label>\n"
				+" <input type=\"text\" placeholder=\"ID\" name=\"id\" required>\n"+"<br />"
				+"<label for=\"department\">"+"Students's Department"+"</label>\n"
				+" <input type=\"text\" placeholder=\"Department\" name=\"department\" required>\n"+"<br />"
				+ "<a href=\"AddStudentProcess\">"
				+	"<button type='submit'>Add New Student</button>"
				+"</a>"
				+"</form>\n"
				+"</body>\n"
				+"</html>\n");
		
	}
	


}
