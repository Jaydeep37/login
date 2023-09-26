import java.sql.*;
calss P1
{
	public static void main(String args[])
	{
		try
		{
			Connection cn=DriverManager.getConnection("jdbc.mysql://localhost:3306/systudent","root","");
			Statement st=cn.CreateStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM stud");
			while(rs.next())
			{
				System.out.println("Record Found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

	
