import java.sql.*
class P4
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			Statement st = cn.createStatement();
			
			st.execute("insert into stud values (3,'ccc','amd','789879723')");
			st.execute("select*from stud");

			ResultSet rs = st.getResultSet();
			while(rs.next())
			{
				System.out.println("Record Found");
			}	
		}
		catch(Exception e)
		{
			System.out.println("Record Not Found");
		}
	}	
}