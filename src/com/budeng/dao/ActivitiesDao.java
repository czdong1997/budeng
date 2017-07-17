package com.budeng.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.budeng.util.DBUtil;
import com.budeng.vo.Activities;

public class ActivitiesDao {

	private DBUtil util = DBUtil.getInstance();
	private ResultSet rs;
	private String sql;

	public List<Activities> queryAllAct() {
		util.getConnection();
		sql = "select * from activities";
		rs = util.query(sql, null);
		List<Activities> list = new ArrayList<Activities>();
		try {
			while(rs.next()) {
				Activities s = new Activities();
				s.setDateId(rs.getInt("dateId"));
				s.setManagerId(rs.getInt("managerId"));
				s.setText(rs.getString("text"));
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
	
	public Activities queryActByManaId(int id) {
		util.getConnection();
		sql = "select * from activities where managerId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		rs = util.query(sql, params);
		Activities s = new Activities();
		try {
			while(rs.next()) {
				s.setDateId(rs.getInt("dateId"));
				s.setManagerId(rs.getInt("managerId"));
				s.setText(rs.getString("text"));
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
	public void insertAct(Activities s) {
		util.getConnection();
		sql = "insert into activities(dateId, managerId, text) values(?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getDateId());
		params.add(s.getManagerId());
		params.add(s.getText());
		
		util.update(sql, params);
		util.close();
	}
	
	//¸üÐÂ
	public void updateActByManaId(Activities s) {
		util.getConnection();
		sql = "update activities set dateId=?, text=? where managerId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getDateId());
		params.add(s.getText());
		params.add(s.getManagerId());
		
		util.update(sql, params);
		util.close();
	}
	
	//É¾³ý
	public void delActByManaId(int id) {
		util.getConnection();
		sql = "delete from activities where managerId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		util.update(sql, params);
		util.close();
	}
}
