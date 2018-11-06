package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import db.dbutil;
import entity.article;

public class articledao {
	
	public boolean addarticle(String title, String content, String date, int userid, int atid){
		Connection conn=dbutil.getConnection();
		String sql="" +
				"insert into article" +
				"(title,content,date,userid,atid,"  +
				"values(" +
				"?,?,?,?,?)";
		PreparedStatement ptmt = null;
		if (conn == null) {
			return false;
		}
		try {
			ptmt = conn.prepareStatement(sql);
		
			ptmt.setString(1, title);
		
		ptmt.setString(2, content);
		ptmt.setString(3, date);
		ptmt.setInt(4, userid);
		ptmt.setInt(5, atid);
		ptmt.executeUpdate();
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}
	
	public void updatea(String title, String content, String date, int userid, int atid) throws SQLException{
		Connection conn=dbutil.getConnection();
		String sql="" +
				" update article " +
				" set title=?,content=?,date=?,userid=?,atid=?, "  +
				" where typeid=? ";
		PreparedStatement ptmt=conn.prepareStatement(sql);
		
		ptmt.setString(1, title);
		ptmt.setString(2, content);
		ptmt.setString(3, date);
		ptmt.setInt(4, userid);
		ptmt.setInt(5, atid);
		ptmt.execute();
	}
	
	
	public boolean delarticle(int id) {
		Connection conn=dbutil.getConnection();
		String sql="" +
				" delete from article " +
				" where typeid=? ";
		
		if (conn == null) {
			return false;
		}
		try {
			PreparedStatement ptmt=conn.prepareStatement(sql);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<article> findInfoAll() {
		List<article> list = new ArrayList<article>();
		Connection conn=dbutil.getConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM article;");
			while (rs.next()) {
				article article = new article();
				article.setTypeid(rs.getInt("typeid"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				article.setDate(rs.getString("date"));
				article.setUserid(rs.getInt("userid"));
				article.setAtid(rs.getInt("atid"));
				list.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<article> findtitle() {
		List<article> lists = new ArrayList<article>();
		Connection conn=dbutil.getConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM article WHERE title=?;");
			while (rs.next()) {
				article article = new article();
				article.setTypeid(rs.getInt("typeid"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				
				article.setDate(rs.getString("date"));
				article.setUserid(rs.getInt("userid"));
				article.setAtid(rs.getInt("atid"));
				lists.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lists;
	}
	public List<article> findid1() {
		List<article> lists = new ArrayList<article>();
		Connection conn=dbutil.getConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM article WHERE atid=1;");
			while (rs.next()) {
				article article = new article();
				article.setTypeid(rs.getInt("typeid"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				
				article.setDate(rs.getString("date"));
				article.setUserid(rs.getInt("userid"));
				article.setAtid(rs.getInt("atid"));
				lists.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lists;
	}
	public List<article> findid2() {
		List<article> lists = new ArrayList<article>();
		Connection conn=dbutil.getConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM article WHERE atid=2;");
			while (rs.next()) {
				article article = new article();
				article.setTypeid(rs.getInt("typeid"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				
				article.setDate(rs.getString("date"));
				article.setUserid(rs.getInt("userid"));
				article.setAtid(rs.getInt("atid"));
				lists.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lists;
	}
	public List<article> findid3() {
		List<article> lists = new ArrayList<article>();
		Connection conn=dbutil.getConnection();
		try {
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM article WHERE atid=3;");
			while (rs.next()) {
				article article = new article();
				article.setTypeid(rs.getInt("typeid"));
				article.setTitle(rs.getString("title"));
				article.setContent(rs.getString("content"));
				
				article.setDate(rs.getString("date"));
				article.setUserid(rs.getInt("userid"));
				article.setAtid(rs.getInt("atid"));
				lists.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lists;
	}
}
