import java.sql.*;
import java.io.*;
class P2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1");	
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","scott","tiger");
			System.out.println("1");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.print(" ID : "+rs.getInt(1));
				System.out.print(" Name : "+rs.getString(2));
				System.out.print(" Job : "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
} 