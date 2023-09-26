import java.sql.*;
class P6
{
	public static void main(String args[])
	{
		Connection cn;
		Statement st;
		ResultSet rs;
		try
		{
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/systudent","root","");

			st = cn.createStatement();
			st.execute("update stud set cno='9089090909' where rno=3");
			st.execute("update stud set name='Manav' where rno=3");
			st.execute("select * from stud");

			rs=st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}