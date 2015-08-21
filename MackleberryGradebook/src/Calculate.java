import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;


@WebServlet("/Calculate")
public class Calculate<summary> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static Connection conn;
       

    public Calculate() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("A");
		String assignType = request.getParameter("B");
		String summary = "", grade = "";
		double numgrade = 0, average = 0, finavg = 0, count = 0;
		Statement stmt = null;
		
		 try {
	            String url = "jdbc:oracle:thin:testuser/password@localhost";
	             Class.forName("oracle.jdbc.driver.OracleDriver");
	            //properties for creating connection to Oracle database
	            Properties props = new Properties();
	            props.setProperty("user", "testdb");
	            props.setProperty("password", "password");

	            //creating connection to Oracle database using JDBC


	                conn = DriverManager.getConnection(url,props);
	               stmt = conn.createStatement();
	            } catch (Exception e) {
	                e.printStackTrace();}
		try {
	 
		String custID = request.getParameter("display");
		if(custID.equalsIgnoreCase("A"))
		{
				ResultSet rs = stmt.executeQuery("Select StudentID, Assignment, Assigntype, AssignDate, Grade from grades where studentID = " + ID);
				summary += "<table class=\"table table-bordered\">";
				summary += "<thead><tr><th>Student ID</th><th>Assignment</th><th>Assignment Type</th><th>Assignment Date</th><th>Grade</th></tr></thead><tbody>";
				while (rs.next())
				{
		    		summary += "<tr>";
		    		summary += "<td>";
		    		summary += rs.getString("STUDENTID");
		    		summary+= "</td>";
		    		summary += "<td>";
		    		summary += rs.getString("ASSIGNMENT");
		    		summary+= "</td>";
		    		summary += "<td>";
		    		summary += rs.getString("ASSIGNTYPE");
		    		summary+= "</td>";
		    		summary += "<td>";
		    		summary += rs.getString("ASSIGNDATE");
		    		summary+= "</td>";
		    		summary += "<td>";
		    		summary+= rs.getString("GRADE");
		    		summary+= "</td>";
		    		summary += "</tr>";
				}
				summary += "</table></tbody>";
		}
		else if (custID.equalsIgnoreCase("B"))
		{
			ResultSet rs = stmt.executeQuery("Select StudentID, Assignment, Assigntype, AssignDate, Grade from grades where AssignType = '" + assignType + "'");
			summary += "<table class=\"table table-bordered\">";
			summary += "<thead><tr><th>Student ID</th><th>Assignment</th><th>Assignment Type</th><th>Assignment Date</th><th>Grade</th></tr></thead><tbody>";
			while (rs.next())
			{
	    		summary += "<tr>";
	    		summary += "<td>";
	    		summary += rs.getString("STUDENTID");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNMENT");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNTYPE");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNDATE");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary+= rs.getString("GRADE");
	    		summary+= "</td>";
	    		summary += "</tr>";
			}
			summary += "</table></tbody>";
			}
		else if (custID.equalsIgnoreCase("C"))
		{
			ResultSet rs = stmt.executeQuery("Select StudentID, Assignment, Assigntype, AssignDate, Grade from grades where AssignType = '" + assignType + "' and studentID =" + ID);
			summary += "<table class=\"table table-bordered\">";
			summary += "<thead><tr><th>Student ID</th><th>Assignment</th><th>Assignment Type</th><th>Assignment Date</th><th>Grade</th></tr></thead><tbody>";
			while (rs.next())
			{
	    		summary += "<tr>";
	    		summary += "<td>";
	    		summary += rs.getString("STUDENTID");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNMENT");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNTYPE");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary += rs.getString("ASSIGNDATE");
	    		summary+= "</td>";
	    		summary += "<td>";
	    		summary+= rs.getString("GRADE");
	    		summary+= "</td>";
	    		summary += "</tr>";
			}
			summary += "</table></tbody>";
		}
		else if (custID.equalsIgnoreCase("D"))
		{
			ResultSet rs = stmt.executeQuery("Select grade from grades where StudentID = " + ID);
			while (rs.next())
			{
				grade = rs.getString("Grade");
				numgrade = Double.parseDouble(grade);
				average += numgrade;
				count++;
			}
			finavg = average/count;
			summary = "<h4> The grade average for studentID " + ID + " is " + finavg + "</h4>"; 
		}
		else if (custID.equalsIgnoreCase("E"))
		{
			ResultSet rs = stmt.executeQuery("select max(grade), min(grade) from grades where AssignType = '" + assignType + "'");
			rs.next();
			summary = "<h4> The Highest Grade for " + assignType + " is " + rs.getString("max(grade)") + " and the Lowest Grade is " + rs.getString("min(grade)") + "</h4>";
		}
		
		}
		catch (Exception e) {
            e.printStackTrace();}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("summary", summary);
		getServletContext().getRequestDispatcher("/calcsum.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
