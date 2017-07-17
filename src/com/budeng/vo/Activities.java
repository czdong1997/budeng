package com.budeng.vo;

public class Activities{//近期食堂活动（包含兼职信息）的推送
	int managerId;//推送提交人
	int dateId;//推送提交时间
	String text;//推送内绒
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDateId() {
		return dateId;
	}
	public void setDateId(int dateId) {
		this.dateId = dateId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}


}