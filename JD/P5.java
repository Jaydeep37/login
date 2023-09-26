import java.sql.*;
class P5
{
	public static void main(String args[])
	{
		try
		{
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/systudent","root","");

			Statement st = cn.createStatement();

			st.execute("insert into stud values(3,'priyansh','amd','7827837283')");
			st.execute("select * from stud");
				
			ResultSet rs = st.getResultSet();
			while(rs.next())
			{
				System.out.println("Record Inserted");
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}