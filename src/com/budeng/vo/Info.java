package com.budeng.vo;


public class Info{//预订浏览信息记录
	int userId;//(与用户ID形成主外键的关系)
	int dateId;//(与日期类形成主外键关系)
	int foodId;//(与food类形成主外键关系)
	int cost;//消费记录（0:浏览，大于0的表示自己的消费记录）
	String comment;//每条消费记录的评价信息
	
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
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	

}
