package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dbutil;

import java.lang.Exception;

import entity.user;

public class userdao {

	Connection conn = null;
	PreparedStatement psmt = null;

	public userdao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boke", "root", "123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public user checkUser(String name, String pwd) {
		if (conn == null) {
			return null;
		}
		try {
			psmt = conn.prepareStatement("select * from user where name=? and pwd=?");
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			ResultSet rs = psmt.executeQuery();
			user user = new user();
			while (rs.next()) { 
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setQq(rs.getString("qq"));
				user.setInfo(rs.getString("info"));
				return user;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean regeistUser(String name, String pwd, String email, String phone, String qq, String info) {
		if (conn == null) {
			return false;
		}
		try {
			psmt = conn.prepareStatement("INSERT INTO user(name,pwd,email,phone,qq,info) VALUES (?,?,?,?,?,?);");
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			psmt.setString(3, email);
			psmt.setString(4, phone);
			psmt.setString(5, qq);
			psmt.setString(6, info);

			psmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<user> findInfoAll() {
		List<user> list = new ArrayList<user>();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM user;");
			while (rs.next()) {
				user user = new user();
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setQq(rs.getString("qq"));
				user.setInfo(rs.getString("info"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean deletUser(int id) {
		if (conn == null) {
			return false;
		}
		try {
			psmt = conn.prepareStatement("DELETE FROM user WHERE id=?");
			psmt.setInt(1, id);
			psmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public void updateuser(String name, String pwd, String email, String phone, String qq, String info) throws SQLException{
		Connection conn=dbutil.getConnection();
		String sql="" +
				" update user " +
				" set name=?,pwd=?,email=?,phone=?,qq=?,info=?, "  +
				" where id=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, name);
		ptmt.setString(2, pwd);
		ptmt.setString(3, email);
		ptmt.setString(4, phone);
		ptmt.setString(5, qq);
		ptmt.setString(6, info);
		ptmt.execute();
	}
}
