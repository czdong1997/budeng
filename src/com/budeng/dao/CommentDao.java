package com.budeng.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.budeng.util.DBUtil;
import com.budeng.vo.Comment;

public class CommentDao {

	private DBUtil util = DBUtil.getInstance();
	private ResultSet rs;
	private String sql;

	public List<Comment> queryAllCom() {
		util.getConnection();
		sql = "select * from comment";
		rs = util.query(sql, null);
		List<Comment> list = new ArrayList<Comment>();
		try {
			while(rs.next()) {
				Comment s = new Comment();
				s.setContent(rs.getString("content"));
				s.setDateId(rs.getInt("dateId"));
				s.setFoodId(rs.getInt("foodId"));
				s.setNumOfAgree(rs.getInt("numOfAgree"));
				s.setNumOfDisagree(rs.getInt("numOfDisagree"));
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
	
	public Comment queryComByUserId(int id) {
		util.getConnection();
		sql = "select * from comment where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		rs = util.query(sql, params);
		Comment s = new Comment();
		try {
			while(rs.next()) {
				s.setContent(rs.getString("content"));
				s.setDateId(rs.getInt("dateId"));
				s.setFoodId(rs.getInt("foodId"));
				s.setNumOfAgree(rs.getInt("numOfAgree"));
				s.setNumOfDisagree(rs.getInt("numOfDisagree"));
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
	public void insertCom(Comment s) {
		util.getConnection();
		sql = "insert into comment(content, dateId, foodId, numOfAgree, numOfDisagree, userId) values(?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getContent());
		params.add(s.getDateId());
		params.add(s.getFoodId());
		params.add(s.getNumOfAgree());
		params.add(s.getNumOfDisagree());
		params.add(s.getUserId());
		
		util.update(sql, params);
		util.close();
	}
	
	//¸üÐÂ
	public void updateComByUserId(Comment s) {
		util.getConnection();
		sql = "update comment set content=?, dateId=?, foodId=?, numOfAgree=?, numOfDisagree where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(s.getContent());
		params.add(s.getDateId());
		params.add(s.getFoodId());
		params.add(s.getNumOfAgree());
		params.add(s.getNumOfDisagree());
		params.add(s.getUserId());
		
		
		util.update(sql, params);
		util.close();
	}
	
	//É¾³ý
	public void delCanByUserId(int id) {
		util.getConnection();
		sql = "delete from comment where userId=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		util.update(sql, params);
		util.close();
	}
}
