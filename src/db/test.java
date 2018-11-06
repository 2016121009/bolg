package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

	
	public static void main(String[] args) throws Exception {
		
		
		
//	   Statement stmt=conn.createStatement();
//	    ResultSet rs = stmt.executeQuery("select id,name from user" );
		  String URL="jdbc:mysql://localhost:3306/boke";
		String NAME="root";
		  String PASSWORD="123456";	   
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
	    	System.out.print("连接成功");
	    }catch(SQLException|ClassNotFoundException e) {
	    	e.printStackTrace();
	    	System.out.print("连接失败");
	    }
	    
//	   while(rs.next()) {
//	    	System.out.println(rs.getInt("id")+","+rs.getString("name"));
//	    }
		
	}

}
