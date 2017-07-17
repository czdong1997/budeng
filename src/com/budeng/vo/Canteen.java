package com.budeng.vo;

public class Canteen{
	int id;
	String name;//食堂名称
	String telep;//食堂管理者的电话
	int managerId;//食堂负责人
	String introduction;//食堂的简介
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
	public String getTelep() {
		return telep;
	}
	public void setTelep(String telep) {
		this.telep = telep;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}


}