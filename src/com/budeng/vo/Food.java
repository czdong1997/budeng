package com.budeng.vo;

public class Food{
	int id;
	String name;//ʳƷ����
	String brief_info;//ʳƷ�Ļ������
	String full_info;//ʳƷ����ϸ�Ľ���
	double calorie;//ʳƷ��·��
	int sales;//���������а�
	int canteenId;//����ʳ�ñ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrief_info() {
		return brief_info;
	}
	public void setBrief_info(String briefInfo) {
		brief_info = briefInfo;
	}
	public String getFull_info() {
		return full_info;
	}
	public void setFull_info(String fullInfo) {
		full_info = fullInfo;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getCanteenId() {
		return canteenId;
	}
	public void setCanteenId(int canteenId) {
		this.canteenId = canteenId;
	}



}