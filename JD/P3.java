import java.sql.*;
import java.io.*;
class P3
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection cn = DriverManager.getConnection("jdbc:ucanaccess://F:/drivers/Database.accdb");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(" ID : "+rs.getInt(1));
				System.out.print(" Name : "+rs.getString(2));
				System.out.print(" City : "+rs.getString(3));
				System.out.println();
			}
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
	}
}