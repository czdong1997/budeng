package com.budeng.vo;

public class Comment{
	String content;
	int userId;
	int foodId;
	int dateId;
	int numOfAgree;
	int numOfDisagree;
	
	public int getNumOfAgree() {
		return numOfAgree;
	}
	public void setNumOfAgree(int numOfAgree) {
		this.numOfAgree = numOfAgree;
	}
	
	public int getNumOfDisagree() {
		return numOfDisagree;
	}
	public void setNumOfDisagree(int numOfDisagree) {
		this.numOfDisagree = numOfDisagree;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public int getDateId() {
		return dateId;
	}
	public void setDateId(int dateId) {
		this.dateId = dateId;
	}

}