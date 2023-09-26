
import java.sql.*;
class P7
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
			//st.execute("create table feedback(nm varchar(50),email varchar(100),cno varchar(100),cmt varchar(50))");		
			st.execute("insert into feedback values('Aditya','aditya@gmail.com','90333 45623','Aditya Topper Of Ruparel Education pvt.ltd')");
			//st.execute("insert into feedback values('Manav','manav.@gmail.com','95376 94055','Manav Sisodiya Brand of Maliya hatinaaa')");						
			st.execute("select * from feedback");
	
			rs = st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}