package database;


//Factory method pattern
import java.sql.*;

public class Connect {
	public Connection con;
	public Connect(String username,String password) {
		
		try{
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"oes",username,password);
			System.out.println("Connection Established.");
		}
		catch(Exception e)
		{
			System.out.println("Driver is not Loaded.");
			System.out.println("Exception : "+e.getMessage());
		}
		
	}
	public static void main(String []args)
	{
		new Connect("root","");
	}

}
