package com.budeng.vo;

public class Food{
	int id;
	String name;//食品名称
	String brief_info;//食品的基本简介
	String full_info;//食品的详细的介绍
	double calorie;//食品卡路里
	int sales;//销量（排行榜）
	int canteenId;//所属食堂编号
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