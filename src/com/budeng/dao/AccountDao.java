package com.budeng.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.budeng.util.DBUtil;
import com.budeng.vo.Account;


public class AccountDao {

	private DBUtil util = DBUtil.getInstance();
	private ResultSet rs;
	private String sql;

	public List<Account> queryAllAcc() {
		util.getConnection();
		sql = "select * from account";
		rs = util.query(sql, null);
		List<Account> list = new ArrayList<Account>();
		try {
			while(rs.next()) {
				Account s = new Account();
				s.setCalorie(rs.getInt("calorize"));
				s.setChange(rs.getDouble("change"));
				s.setDateId(rs.getInt(rs.getInt("dateId")));
				s.setUserId(rs.getInt("userId"));
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
	
	public Account queryAccByUserId(int id) {
		util.getConnection();
		sql = "select * from account where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		rs = util.query(sql, params);
		Account s = new Account();
		try {
			while(rs.next()) {
				s.setCalorie(rs.getInt("calorize"));
				s.setChange(rs.getDouble("change"));
				s.setDateId(rs.getInt(rs.getInt("dateId")));
				s.setUserId(rs.getInt("userId"));
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
	public void insertAcc(Account s) {
		util.getConnection();
		sql = "insert into account(calorize, change, dateId, userId) values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getCalorie());
		params.add(s.getChange());
		params.add(s.getDateId());
		params.add(s.getUserId());
		
		util.update(sql, params);
		util.close();
	}
	
	//¸üÐÂ
	public void updateAccByUserId(Account s) {
		util.getConnection();
		sql = "update account set calorize=?, change=?, dateId=? where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getCalorie());
		params.add(s.getChange());
		params.add(s.getDateId());
		params.add(s.getUserId());
		
		util.update(sql, params);
		util.close();
	}
	
	//É¾³ý
	public void delStuByUserId(int id) {
		util.getConnection();
		sql = "delete from account where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		util.update(sql, params);
		util.close();
	}
	
}
