package Test_frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db_connect 
{

	public static void main(String[] args) throws Exception
	{
		//load the driver class into memory
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
        
        //get connection to the Database               //connection String
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=pubs","sa","123");
		
		
		Statement st = conn.createStatement();
		st.execute("insert into publishers values(9991,'vikas','hyd','TS','ind')");
		//st.execute("exec pr1");
		
		ResultSet rs = st.executeQuery("select pub_id,pub_name from publishers");
		while (rs.next()) 
		{
			System.out.println(rs.getInt(1)+"      "+rs.getString(2));
		}

	}

}
