package com.budeng.vo;


public class Info{//Ԥ�������Ϣ��¼
	int userId;//(���û�ID�γ�������Ĺ�ϵ)
	int dateId;//(���������γ��������ϵ)
	int foodId;//(��food���γ��������ϵ)
	int cost;//���Ѽ�¼��0:���������0�ı�ʾ�Լ������Ѽ�¼��
	String comment;//ÿ�����Ѽ�¼��������Ϣ
	
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
