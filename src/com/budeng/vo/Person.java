package com.budeng.vo;

public class Person{//个人基本信息
	int id;//ID（主键，自动增长）
	String name;//姓名
	int sex;//性别
	String user_name; //用户名
	String password;//密码
	String telephone;//电话号码（可用于找回密码以及注册登录）
	
	public Person(){ };
	
	public Person(int id, String name, int sex, String userName,
			String password, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		user_name = userName;
		this.password = password;
		this.telephone = telephone;
	}
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String userName) {
		user_name = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
}