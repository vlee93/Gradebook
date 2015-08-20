import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GradeInput")
public class GradeInput extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
        static Connection conn;
        
    public GradeInput() {
        super();
        
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String ID = request.getParameter("studetID");
        String assignment = request.getParameter("assignment");
        String assignType = request.getParameter("assignType");
        String assignDate = request.getParameter("assignDate");
        String grade = request.getParameter("grade");
        
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
        try {
        	String sql = "Insert into grades(STUDENTID, assignment, ASSIGNTYPE, ASSIGNDATE, grade) values (" + ID + ", '" + assignment + "', '"+ assignType +"', to_date('" + assignDate +"','MM/DD/YYYY'), "  + grade + ")";
            PreparedStatement preStatement = conn.prepareStatement(sql);
            ResultSet result = preStatement.executeQuery();
            result.next();


        } catch (SQLException e) {

            e.printStackTrace();
        }
        
        //This line brings you to the Gradebook page
        RequestDispatcher rd = request.getRequestDispatcher("Gradebook");
        rd.forward(request, response);
        

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        
    }

}
