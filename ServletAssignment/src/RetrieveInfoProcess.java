
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/RetrieveInfoProcess")
public class RetrieveInfoProcess extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			PrintWriter out = response.getWriter();
			out.print("connection success");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=UTC", "root", "1234");
			Statement stmt = conn.createStatement();		
			String id = request.getParameter("id");
			ResultSet rs = stmt.executeQuery ("Select * from student where id = "+ id);
			 ResultSetMetaData rsmd =rs.getMetaData();
			 out.println("<table border=\"1\">"
                     + "<tr>"
                     + "<th>ID</th>"
                     +"<th>Name</th>"
                     +"<th>Department</th>"
                     + "<th>Science</th>"
                     + "<th>Mathematic</th>"
                     + "<th>Computer Science</th>"
                     + "<th>Average</th>"
                     + "</tr>");
           
           while(rs.next()){
         	  int average=(rs.getInt("science")+ rs.getInt("math")+ rs.getInt("compScience"))/3;
         	  
         	out.println("<tr>"
         			  + "<td>" + rs.getString("id") + "</td>"
         			  +"<td>" + rs.getString("name") + "</td>"
         			  +"<td>" + rs.getString("department")+"</td>"
         			  + "<td>" + rs.getString("science") + "</td>"
         			  + "<td>" + rs.getString("math") + "</td>"
         			  + "<td>" + rs.getString("compScience") + "</td>"
         			  + "<td>" + average + "</td>"
         			  + "</tr>");
           }
           out.println("</table>" +"<a href=\"Index\">"+"Return to Home"+
           "</a>"+ "</body>" + "</html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	

}
