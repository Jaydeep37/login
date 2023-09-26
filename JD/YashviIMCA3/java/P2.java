import java.sql.*;
class P2
{
	public static void main(String args[])
	{
		Connection cn;
		CallableStatement st;
		try
		{
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
			st=cn.prepareCall("{call student_ins(?,?,?,?)}");
			st.setInt(1,104);
			st.setString