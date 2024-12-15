package myproject;
import java.sql.*;

// fetch value from mysql database jdbcdb

public class jdb01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		String query ="select name from demos where id=2;";
		String query ="select * from demos";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","snsupratim004@mysql");
		
		System.out.println("connection established");
		
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userData="";
		
		
//		String name=rs.getString("name");
//		System.out.println(name);
//		rs.next();
//		userData=rs.getInt(1)+" : "+rs.getString(2);
//		System.out.println(userData);
//		rs.next();
//		userData=rs.getInt(1)+" : "+rs.getString(2);
//		System.out.println(userData);
//		rs.next();
//		userData=rs.getInt(1)+" : "+rs.getString(2);
//		System.out.println(userData);
		while(rs.next()) {
			userData=rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(userData);
		}

		
		st.close();
		con.close();
		
		
	}
}
