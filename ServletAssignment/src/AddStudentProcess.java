
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.*;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudentProcess")
public class AddStudentProcess extends HttpServlet {
	String fail = "process failed";
	String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");  
		String id=request.getParameter("id");  
	    String name=request.getParameter("name");
	    String department=request.getParameter("department");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1?useTimezone=true&serverTimezone=UTC", "root", "1234");
			PreparedStatement stmt = conn.prepareStatement("insert into student(id, name, department) values (?,?,?)");
			
			stmt.setString(1, id);
			stmt.setString(2, name);
			stmt.setString(3,department);
			
			boolean success=stmt.execute();
			if(success==false) {
				out.println("<p>"+"Successfully Added!"+"</p>");
				out.println("</table>" +"<a href=\"Index\">"+"Return to Home"+
				           "</a>"+ "</body>" + "</html>");
			}
			else {
				out.println(docType+"<font size=\"12px\" color=\"" + "red" + "\">" +
	    		         fail
	    			  +"</p>");
			out.println("</table>" +"<a href=\"Index\">"+"Return to Home"+
			           "</a>"+ "</body>" + "</html>");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


}
