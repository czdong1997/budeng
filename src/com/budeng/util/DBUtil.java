package com.budeng.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBUtil {
	
	private String url = "jdbc:mysql://localhost:3306/nuaa";
	private String driver = "com.mysql.jdbc.Driver";
	private String user = "root";
	private String password = "123";
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private static final DBUtil util = new DBUtil();
	
	private DBUtil() {
		
	}
	
	public static DBUtil getInstance() {
		return util;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public ResultSet query(String sql, List<Object> params) {
		try {
			ps = conn.prepareStatement(sql);
			if(params!=null && params.size()>0) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void update(String sql, List<Object> params) {
		try {
			ps = conn.prepareStatement(sql);
			if(params!=null && params.size()>0) {
				for(int i=0;i<params.size();i++) {
					ps.setObject(i+1, params.get(i));
				}
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
