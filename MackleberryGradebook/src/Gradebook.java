import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//This retrieves information from the gradebook

@WebServlet("/Gradebook")
public class Gradebook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static Connection conn;
	
    public Gradebook() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String allBook = "";
		Double average = 0.0;
		
		try {
			String url = "jdbc:oracle:thin:testuser/password@localhost"; 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		    //properties for creating connection to Oracle database
		    Properties props = new Properties();
		    props.setProperty("user", "testdb");
		    props.setProperty("password", "password");
		   
		    //creating connection to Oracle database using JDBC
		    
				conn = DriverManager.getConnection(url,props);
			} catch (Exception e) {

				e.printStackTrace();
			}

		// StudentID, Assignment, AssignType, AssignDate, Grade
		    try {
		    	PreparedStatement preStatement = conn.prepareStatement("select * from grades");
				ResultSet result = preStatement.executeQuery();
				while (result.next())
				{
		    		allBook += "<tr>";
		    		allBook += "<td>";
		    		allBook += result.getString("STUDENTID");
		    		allBook+= "</td>";
		    		allBook += "<td>";
		    		allBook += result.getString("ASSIGNMENT");
		    		allBook+= "</td>";
		    		allBook += "<td>";
		    		allBook += result.getString("ASSIGNTYPE");
		    		allBook+= "</td>";
		    		allBook += "<td>";
		    		allBook += result.getString("ASSIGNDATE");
		    		allBook+= "</td>";
		    		allBook += "<td>";
		    		allBook+= result.getString("GRADE");
		    		allBook+= "</td>";
		    		allBook += "</tr>";
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		
			request.setAttribute("allBook", allBook);
			
			try{
				PreparedStatement preStatement = conn.prepareStatement("select avg(grade) as average from grades");
				ResultSet result = preStatement.executeQuery();
				result.next();
				average = result.getDouble("average");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			String averagestring = String.format("%.2f", average);
			request.setAttribute("average", averagestring);
			getServletContext().getRequestDispatcher("/allBook.jsp").forward(request, response);
		    
	}


	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
