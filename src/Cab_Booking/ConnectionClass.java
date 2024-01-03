package Cab_Booking;
import java.sql.*;

public class ConnectionClass
{
	Connection con;
	Statement stm;
	ConnectionClass()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cab_Booking","root","Sachin@123");
			stm=con.createStatement();
			
			if(con.isClosed())
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");

			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void main (String args[]) {
	
	{
		new ConnectionClass();
	}
	}
}

