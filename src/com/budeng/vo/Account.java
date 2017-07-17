package com.budeng.vo;

public class Account{//账单记录以及每天的摄入卡路里记录
	int userId;
	int dateId;
	double change; //消费/充值记录
	int calorie;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDateId() {
		return dateId;
	}
	public void setDateId(int dateId) {
		this.dateId = dateId;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


}