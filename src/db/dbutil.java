package db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class dbutil {
	private static final String URL="jdbc:mysql://localhost:3306/boke";
	private static final String NAME="root";
	private static final String PASSWORD="123456";
	
	//public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		
		//Connection conn = DriverManager.getConnection(URL, NAME, PASSWORD);
	   // Statement stmt=conn.createStatement();
	   // ResultSet rs = stmt.executeQuery("select id,name from people" );
	    
	   // while(rs.next()) {
	   // 	System.out.println(rs.getInt("id")+","+rs.getString("name"));
	   // }
		
	//}
private static Connection conn=null;
	
	static {
		try {
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.获得数据库的连接
			conn=DriverManager.getConnection(URL, NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return conn;
	}

}
