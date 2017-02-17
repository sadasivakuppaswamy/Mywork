package jdbc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

/**
 * Created by Sadasiva.Kuppaswamy on 26-04-2016.
 */
public class SeleniumDataBaseTesting {
    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    @BeforeClass
    public void setUp() {
        String databaseURL = "jdbc:mysql://localhost:3306/local";
        String user = "sadasiva.kuppaswamy";
        String password = "SKwelcome5";
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void getEmployeesFromDataBase() {
        try {
            String query = "select * from companies";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while(rs.next()){
                int EmpId= rs.getInt("company_oid");
                String EmpName= rs.getString("name");
                String EmpAddress=rs.getString(3);
                String EmpDept=rs.getString("logical_database");
                Double EmpSal= rs.getDouble(5);
                System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
