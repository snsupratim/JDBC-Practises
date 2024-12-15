package myproject;
import java.sql.*;

// add value to mysql database jdbcdb

public class jdb02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int userid=7;
		String username="supratimnag";
//		String query ="insert into demos values (5,'sniddhartha')";
//		String query ="insert into demos values ("+ userid + " , ' " + username + "')";
		String query ="insert into demos values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","snsupratim004@mysql");
		
		System.out.println("connection established");
		
//		Statement st=con.createStatement();
//		ResultSet rs = st.executeQuery(query);--DQL
//		int count= st.executeUpdate(query); --DML
		
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
		int count= st.executeUpdate();
		System.out.println(count + "row/s affected");
		


		
		st.close();
		con.close();
		
		
	}
}
