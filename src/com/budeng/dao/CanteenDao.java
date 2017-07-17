package com.budeng.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.budeng.util.DBUtil;
import com.budeng.vo.Canteen;

public class CanteenDao {

	private DBUtil util = DBUtil.getInstance();
	private ResultSet rs;
	private String sql;

	public List<Canteen> queryAllCan() {
		util.getConnection();
		sql = "select * from canteen";
		rs = util.query(sql, null);
		List<Canteen> list = new ArrayList<Canteen>();
		try {
			while(rs.next()) {
				Canteen s = new Canteen();
				s.setId(rs.getInt("id"));
				s.setIntroduction(rs.getString("introdution"));
				s.setManagerId(rs.getInt("managerId"));
				s.setName(rs.getString("name"));
				s.setTelep(rs.getString("telep"));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close();
		}
		return list;
	}
	
	public Canteen queryCanById(int id) {
		util.getConnection();
		sql = "select * from canteen where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		rs = util.query(sql, params);
		Canteen s = new Canteen();
		try {
			while(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setIntroduction(rs.getString("introdution"));
				s.setManagerId(rs.getInt("managerId"));
				s.setName(rs.getString("name"));
				s.setTelep(rs.getString("telep"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close();
		}
		return s;
	}
	
	//²åÈë
	public void insertCan(Canteen s) {
		util.getConnection();
		sql = "insert into canteen(introduction, managerId, name, telep) values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getIntroduction());
		params.add(s.getManagerId());
		params.add(s.getName());
		params.add(s.getTelep());
		
		util.update(sql, params);
		util.close();
	}
	
	//¸üÐÂ
	public void updateCanById(Canteen s) {
		util.getConnection();
		sql = "update canteen set introduction=?, managerId=?, name=?, telep=? where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getIntroduction());
		params.add(s.getManagerId());
		params.add(s.getName());
		params.add(s.getTelep());
		
		
		util.update(sql, params);
		util.close();
	}
	
	//É¾³ý
	public void delCanById(int id) {
		util.getConnection();
		sql = "delete from canteen where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		util.update(sql, params);
		util.close();
	}
}
