package server;
import java.sql.*;

public class DataBaseCo 
{
	 public static void main(String args[])
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            String dburl="jdbc:mysql://127.0.0.1:3306/criminal";
	            String username="root";
	            String password="root";
	            //connection
	            Connection myConnection=DriverManager.getConnection(dburl,username,password);
	            // statement object
	            Statement myStatement=myConnection.createStatement();
	            // execute quere
	            ResultSet myResultSet=myStatement.executeQuery("select * from clientcheck");

	            //process result statement

	            while(myResultSet.next())
	            {
	                System.out.println(myResultSet.getString("OSName")+" "+myResultSet.getString("Mac")+" "+myResultSet.getString("PublicIP")+" "+myResultSet.getString("PrivateIP"));
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }
}
